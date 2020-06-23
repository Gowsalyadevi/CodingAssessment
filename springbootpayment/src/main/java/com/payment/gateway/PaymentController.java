package com.payment.gateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	private static final String template = "Gowsy, %s!";
	private final String sharedKey = "SHARED_KEY";
	 private static final String SUCCESS_STATUS = "success";
	 private static final String ERROR_STATUS = "error";
	 private static final int CODE_SUCCESS = 100;
	 private static final int AUTH_FAILURE = 102;
	
	@GetMapping("/payment")
	public Payment payment(@RequestParam(value = "name", defaultValue = "") String name,
			@RequestParam(value = "userId", defaultValue = "123") int userId,
			@RequestParam(value = "amount", defaultValue = "1000") double amount) {
		return new Payment(String.format(template, name),userId,amount);
	}
	
	@PostMapping(value = "/pay")
	 public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody Payment request) {
	  BaseResponse response = new BaseResponse();
	  if (sharedKey.equalsIgnoreCase(key)) {
	   int userId = request.getUserId();
	   String name = request.getName();
	   double amount = request.getAmount();
	   // Process the request
	   // ....
	   // Return success response to the client.
	   response.setStatus(SUCCESS_STATUS);
	   response.setCode(CODE_SUCCESS);
	  } else {
	   response.setStatus(ERROR_STATUS);
	   response.setCode(AUTH_FAILURE);
	  }
	  return response;
	 }
}
