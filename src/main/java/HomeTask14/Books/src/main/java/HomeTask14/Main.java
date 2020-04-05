package HomeTask14;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Library library;
        /**
         * Read object from file
         */
        library = mapper.readValue(new File("Books.json"), Library.class);
        library.groupByAuthor();


    }
}

