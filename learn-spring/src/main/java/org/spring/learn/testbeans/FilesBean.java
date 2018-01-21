package org.spring.learn.testbeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project: learn-spring-parent
 * Package: org.spring.learn.testbeans
 * <p>
 * User: vthalapu
 * Date: 1/20/18
 * Time: 7:19 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FilesBean {
    private static final String lineSeparator = System.getProperty("line.separator");
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private String fileType = "";

//    public FilesBean(){
//
//    }
//
//    public FilesBean(String fileType){
//        this.fileType = fileType;
//
//    }


    public void methodFilesBean(){
        logger.info(lineSeparator+"Inside @FilesBean");
    }

    public void printFileType(){
        logger.info(lineSeparator + "Printing File Type => " + ((fileType == null) ? "" : fileType));
    }
}
