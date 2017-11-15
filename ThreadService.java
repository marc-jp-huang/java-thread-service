package com.marc.service;

import java.lang.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 預查回補
 * Created by marc on 2017/4/12.
 */
public class ThreadService {
    private static Logger logger = LoggerFactory.getLogger(ThreadService.class);

    private static int THREAD_NUM;
    
    public static void main(String[] args) {
        
        String taskNum = "";
		int maxTasks = 0;
        // get input variable
        if (args != null && args.length > 0) {
            for (String arg : args) {
				
				//e.g., -task_id=1=2=3 will be ["-task_id","1=2=3"]
                String[] argSplit = arg.split("=", 2);
                if (argSplit.length < 2) {
                    continue;
                }
                String argKey = argSplit[0];
                String argValue = argSplit[1];

                switch (argKey) {
                    case "-task_num":
                        taskNum = argValue;
                        break;
                    default:
                        break;
                }

            }
        }


        try{
			maxTasks = Integer.parseInt(taskId);
		}catch(Exception e){
			logger.error("-task_num must be integer", e);
		}

		if(maxTasks >0){
			ExecutorService executor = Executors.newFixedThreadPool(THREAD_NUM);
            for (int task = 1; task <= maxTasks; task++) {

                executor.execute(new TaskThread(task));
            }
            executor.shutdown();
		}
		
    }

}
