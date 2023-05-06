package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DemoService;
import com.example.demo.model.DemoModel;

@RestController
public class DemoController {
	@Autowired
	DemoService ds;
	@PostMapping("/ins")
	public String insert(@RequestBody DemoModel d)
	{
		return ds.insert(d);
	}
	@GetMapping("/sort/{field}")
	public List<DemoModel> sort(@PathVariable String field)
	{
		return ds.sort(field);
	}
	@GetMapping("/page/{offset}/{pagesize}")
	public List<DemoModel>page(@PathVariable int offset,@PathVariable int pagesize)
	{
		return ds.page(offset,pagesize);
	}
	@GetMapping("/com/{offset}/{pagesize}/{field}")
	public List<DemoModel>paging(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
	{
		return ds.paging(offset,pagesize,field);
	}
	@GetMapping("/fetchDemoModelPrefix")
	public List<DemoModel>fetchDemoModelPrefix(@RequestParam String prefix)
	{
		return ds.fetchDemoModelPrefix(prefix);
	}
	@GetMapping("/suffix")
	public List<DemoModel>fetchDemoModelSufix(@RequestParam String sufix)
	{
		return ds.fetchDemoModelSufix(sufix);
	}
	@GetMapping("/email")
	public List<DemoModel>fetchDemoModelEmail(@RequestParam String email)
	{
		return ds.fetchDemoModelEmail(email);
	}

}
