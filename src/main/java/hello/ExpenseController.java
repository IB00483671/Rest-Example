package main.java.hello;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

	@RequestMapping("/greeting")
	public Expense expense(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Expense(10.2, "Food", new Date());
	}
}