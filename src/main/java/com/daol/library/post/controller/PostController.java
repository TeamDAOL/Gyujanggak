package com.daol.library.post.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.daol.library.common.Pagination;
import com.daol.library.member.domain.Member;
import com.daol.library.post.domain.PageInfo;
import com.daol.library.post.domain.Post;
import com.daol.library.post.service.PostService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
public class PostController {
	
	@Autowired
	private PostService service;
	
	//자유게시판 리스트 출력
	@RequestMapping(value="postList.do",method=RequestMethod.GET)
	public ModelAndView postListView(ModelAndView mv, @RequestParam(value="page",required=false)Integer page,HttpSession session) {
		Member member = (Member)session.getAttribute("loginUser");
		String userId = member.getUserId();
		int currentPage = (page!=null) ? page : 1;
		int totalCount = service.getListCount();
		PageInfo pi = Pagination.getPageInfo(currentPage, totalCount);
		List<Post> pList = service.printAll(pi);
		
		if(!pList.isEmpty()) {
			mv.addObject("pList",pList);
			mv.addObject("userId",userId);
			mv.addObject("pi",pi);
			mv.setViewName("postView/postList");
		}else {
			mv.addObject("msg","게시글 전체조회 실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	//자유게시판 글 작성 페이지 이동
	@RequestMapping(value="postWrite.do",method=RequestMethod.GET)
	public String postWriteView() {
		return "postView/postWrite";
	}
	
	//자유게시판 글 작성
	@RequestMapping(value="postRegister.do",method=RequestMethod.POST)
	public String postWrite(Model model,@ModelAttribute Post post) {
		int result = service.registerPost(post);
		if(result>0) {
			return "redirect:postList.do";
		}else {
			model.addAttribute("msg","등록 실패");
			return "common/errorPage";
		}
	}
	
	//자유게시판 디테일 페이지
	@RequestMapping(value="postDetail.do",method=RequestMethod.GET)
	public ModelAndView postDetailView(ModelAndView mv,@RequestParam("postNo") int postNo) {
		int result = service.addReadCount(postNo);
		Post post = service.printOne(postNo);
		if(result>0) {
			if(post!=null) {
				mv.addObject("post", post);
				mv.setViewName("postView/postDetail");
			}else {
				mv.addObject("msg","조회실패");
				mv.setViewName("common/errorPage");
			}
		}else {
			mv.addObject("msg","조회수 업데이트 실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	//자유게시판 게시글 수정 페이지
	@RequestMapping(value="postModify.do",method=RequestMethod.GET)
	public ModelAndView postModifyView(ModelAndView mv, @RequestParam("postNo") int postNo) {
		Post post = service.printOne(postNo);
		if(post != null) {
			mv.addObject("post",post);
			mv.setViewName("postView/postUpdateView");
		}else {
			mv.addObject("msg","조회실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	//자유게시판 게시글 수정
	@RequestMapping(value="postUpdate.do",method=RequestMethod.POST)
	public ModelAndView postUpdate(ModelAndView mv,@ModelAttribute Post post,@RequestParam("postNo")int postNo) {
		int result = service.modifyPost(post);
		Post view = service.printOne(postNo);
		if(result > 0) {
			if(view != null) {
				mv.addObject("post",post);
				mv.setViewName("postView/postDetail");
			}else {
				mv.addObject("msg","수정실패");
				mv.setViewName("common/errorPage");
			}
		}else {
			mv.addObject("msg","수정실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	//자유게시판 게시글 삭제
	@RequestMapping(value="deletePost.do",method=RequestMethod.GET)
	public String removePost(@RequestParam("postNo") int postNo) {
		int result = service.removePost(postNo);
		if(result > 0) {
			return "redirect:postList.do";
		}else {
			return "common/errorPage";
		}
	}
	
	
	//댓글
	@ResponseBody
	@RequestMapping(value="replyList.do",method=RequestMethod.GET)
	public void getReplyList(@RequestParam("postNo") int postNo,
			HttpServletResponse response) throws Exception {
		List<Post> rList = service.printAllReply(postNo);
		if(!rList.isEmpty()) {
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			gson.toJson(rList, response.getWriter());
		}else{
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			gson.toJson(rList, response.getWriter());
		}
	}
}
