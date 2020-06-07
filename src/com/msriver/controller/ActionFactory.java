package com.msriver.controller;

import com.msriver.action.Action;
import com.msriver.action.BoardDeleteAction;
import com.msriver.action.BoardListAction;
import com.msriver.action.BoardPassCheckAction;
import com.msriver.action.BoardPassCheckFormAction;
import com.msriver.action.BoardUpdateAction;
import com.msriver.action.BoardUpdateFormAction;
import com.msriver.action.BoardViewAction;
import com.msriver.action.BoardWriteAction;
import com.msriver.action.BoardWriteFormAction;

public class ActionFactory {
	private ActionFactory() {};
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		if(command.equals("board_list")) {
			action = new BoardListAction();
		} else if(command.equals("board_write")) {
			action = new BoardWriteAction();
		} else if(command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		} else if(command.equals("board_view")) {
			action = new BoardViewAction();
		} else if(command.equals("board_check_pass_form")) {
			action = new BoardPassCheckFormAction();
		} else if(command.equals("board_check_pass")) {
			action = new BoardPassCheckAction();
		} else if(command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
		} else if(command.equals("board_update")) {
			action = new BoardUpdateAction();
		} else if(command.equals("board_delete")) {
			action = new BoardDeleteAction();
		}
		
		return action;
	}
}
