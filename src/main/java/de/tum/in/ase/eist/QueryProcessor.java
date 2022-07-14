package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else if(query.contains("banana")) {  // TODO extend the programm here\
            return "yellow";
        } else if(query.contains("prime")) {  // TODO extend the programm here\
            return "271";
        } else if(query.contains("16")) {  // TODO extend the programm here\
            return "272";
        } else {
            return "";
        }
    }
}
