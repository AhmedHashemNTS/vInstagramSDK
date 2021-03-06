package com.vivantor.vinstagramsdk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by AhmedNTS on 2016-09-21.
 */
class Utils
{
	static String streamToString(InputStream is) throws IOException
	{
		String str = "";

		if (is != null)
		{
			StringBuilder sb = new StringBuilder();
			String line;

			try
			{
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));

				while ((line = reader.readLine()) != null)
				{
					sb.append(line);
				}

				reader.close();
			}
			finally
			{
				is.close();
			}

			str = sb.toString();
		}

		return str;
	}

	static void notNull(Object arg, String name)
	{
		if (arg == null)
			throw new NullPointerException("Argument '" + name + "' cannot be null");
	}

	static void notNullOrEmpty(String s, String name)
	{
		if ((s == null) || (s.length() == 0))
			throw new IllegalArgumentException("Argument '" + name + "' cannot be null or empty");
	}
}
