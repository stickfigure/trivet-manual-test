package org.example;

import com.voodoodyne.trivet.TrivetServlet;
import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.server.Server;

import java.io.Serial;

public class Main {

	public static class ServerServlet extends TrivetServlet {
		@Serial
		private static final long serialVersionUID = 1L;

		@Override
		public Object getInstance(final Class<?> iface) {
			assert iface == Hello.class;
			return new HelloImpl();
		}
	}

	public static void main(String[] args) throws Exception {
		final Server server = new Server(7778);

		final ServletContextHandler sch = new ServletContextHandler("/");
		sch.addServlet(ServerServlet.class, "/hello");
		server.setHandler(sch);

		server.start();
	}
}