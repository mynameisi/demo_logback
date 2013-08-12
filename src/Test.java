

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	private static final Logger logger=LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		logger.info("这是一条\"一般性信息\"");
		logger.debug("这是一条\"调试性信息\"");
		logger.error("这是一条\"错误信息\"");
		logger.warn("这是一条\"警告信息\"");
	}

}
