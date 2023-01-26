package com.example.demo.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;

@Service
@Transactional
public class MemberServiceImpl implements MemberService
{

	@Resource
	MemberRepository mrepo;
	
	@Override
	public int addMember(Member member) {
		// TODO Auto-generated method stub
		return mrepo.save(member).hashCode();
	}

}
