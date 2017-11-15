package com.marc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;

/**
 * Created by marc on 2017/5/22.
 */
public class TaskThread implements Runnable {
    private static Logger logger = LoggerFactory.getLogger(TaskThread.class);

    public TaskThread(int task) {

        // assign any variables by this before run(), e.g., this.myTask=task

    }

    @Override
    public void run() {
		//do anything you want here
		//use variable by just calling myTask
    }

}
