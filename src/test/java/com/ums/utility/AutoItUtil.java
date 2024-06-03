package com.ums.utility;

import java.io.IOException;

public class AutoItUtil {
	public static void executeAutoItScript(String scriptPath) throws IOException {
        Runtime.getRuntime().exec(scriptPath);
    }
}
