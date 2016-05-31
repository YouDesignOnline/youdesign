package com.youdesign.online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youdesign.online.dao.YouDesignDao;
import com.youdesign.online.domain.ItemInventory;
import com.youdesign.online.domain.Order;
import com.youdesign.online.domain.User;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	YouDesignDao youDesignDao;

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> registerUser(@RequestBody User user) {

		try {

			boolean result = youDesignDao.registerUser(user);
			if (result)
				return ResponseEntity.status(HttpStatus.OK).body(null);
			else
				return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(null);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(e);
		}

	}

	@RequestMapping(value = "placeorder", method = RequestMethod.POST)
	public void placeOrder(@RequestBody Order order) {

	}

	public void getOrderStatus() {

	}

	public void validateUser() {

	}

	public void generateInvoice() {

	}

	public void generateInstructionsToTailor() {

	}
	@RequestMapping(value = "additem", method = RequestMethod.POST)
	public void addItemToInventory(@RequestBody ItemInventory item) {

	}

	public void updateOrderStatus() {

	}

}
