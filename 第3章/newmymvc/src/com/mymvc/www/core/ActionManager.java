package com.mymvc.www.core;

public class ActionManager {

	public static IAction createAction(String className) {
		IAction action = null;
		try {
			action = (IAction) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return action;
	}

}
