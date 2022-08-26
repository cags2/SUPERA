package pkg;
import java.util.*;
import java.io.*;

public class Reply extends Message {

	// Default Constructor
	public Reply() {
		aut = " ";
		subject = " ";
		body = " ";
		number = 0;
	}

	// Parameterized Constructor
	public Reply(String auth, String bod, int i) {
		aut = auth;
		body = bod;
		number = i;
	}

	// Returns if this is a reply (true)
	public boolean isReply(){
		return true;
	}
}
