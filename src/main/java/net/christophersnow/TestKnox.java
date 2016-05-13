package net.christophersnow;

import org.apache.hadoop.gateway.shell.Hadoop;
import org.apache.hadoop.gateway.shell.hdfs.Hdfs;

public class TestKnox {

    public static void main(String[] args) {

    	Hadoop session = Hadoop.login( "test", "test", "test" );
    	
    	String text = Hdfs.get( session ).from( "test" ).now().getString();
    	
    	session.shutdown();
    }
}
