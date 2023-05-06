package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DemoRepository;
import com.example.demo.model.DemoModel;

@Service
public class DemoService {
	@Autowired
	DemoRepository sr;
	public String insert(DemoModel d)
	{
		String result="false";
		DemoModel dm=sr.save(d); 
		if(dm!=null)
		{
		   result="true"; 
		}  
		return result;
	}
	public List<DemoModel> sort(String field)
	{
		return sr.findAll(Sort.by(field));
	}
	public List<DemoModel>page(int offset,int pagesize)
	{
		Pageable paging=PageRequest.of(offset, pagesize);
		Page<DemoModel>data=sr.findAll(paging);
		List<DemoModel>getpage=data.getContent();
		return getpage;
	}
	public List<DemoModel>paging(int offset,int pagesize,String field)
	{
		Pageable pagein=PageRequest.of(offset, pagesize,Sort.by(field));
		Page<DemoModel>data=sr.findAll(pagein);
		List<DemoModel>getpage=data.getContent();
		return getpage;
		
	}
	public List<DemoModel>fetchDemoModelPrefix(String prefix)
	{
		return sr.findByNameStartingWith(prefix);
	}
	public List<DemoModel>fetchDemoModelSufix(String sufix)
	{
		return sr.findByNameEndingWith(sufix);
	}
	public List<DemoModel>fetchDemoModelEmail(String email)
	{
		return sr.findByEmail(email);
	}

}
