package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

public class App {

  public static void main(String[] args) {

    BoardHandler boardList = new BoardHandler();

    MemberHandler memberList = new MemberHandler();

    ProjectHandler projectList = new ProjectHandler(memberList);

    TaskHandler taskList = new TaskHandler(memberList);

    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

        switch (command) {
        case "/board/add":
          boardList.add();
          break;
        case "/board/list":
          boardList.list();
          break;
        case "/board/detail":
          boardList.detail();
          break;
        case "/board/update":
          boardList.update();
          break;
        case "/board/delete":
          boardList.delete();
          break; 
        case "/member/add":
          memberList.add();
          break;
        case "/member/list":
          memberList.list();
          break;
        case "/project/add":
          System.out.println("[프로젝트 등록]");
          projectList.add();
          break;
        case "/project/list":
          System.out.println("[프로젝트 목록]");
          projectList.list();
          break;
        case "/task/add":
          System.out.println("[작업 등록]");
          taskList.add();
          break;
        case "/task/list":
          System.out.println("[작업 목록]");
          taskList.list();
          break;
        case "quit":
        case "exit":
          System.out.println("안녕!");
          break loop;
        default:
          System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }



  }








}
