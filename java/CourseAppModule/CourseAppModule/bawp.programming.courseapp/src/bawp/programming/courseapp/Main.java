package bawp.programming.courseapp;

import bawp.programming.coursedatabase.Course;
import bawp.programming.coursedatabase.CourseServer;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;

public class Main {

    public Main() throws MalformedURLException {
    }

    public static void main(String[] args) throws IOException {

        CourseServer courseServer = new CourseServer();

        List<Course> courses = courseServer.getCourseList();

//        for (Course course : courses) {
//            System.out.println(" Courses " + course.getCourseName());
//        }


        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI("https://www.google.com"))
                    .GET().build();

            try {
                HttpResponse<String> httpResponse = httpClient.send(httpRequest,
                        HttpResponse.BodyHandler.asString());

                System.out.println(httpResponse.body());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


        //Current way
//        URL url = new URL("https://www.buildappswithpaulo.com"); //Specify URL
//        URLConnection urlConnection = url.openConnection();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//
//        String inputLine;
//
//        while ((inputLine = reader.readLine()) != null) {
//            System.out.println(inputLine);
//        }
//        reader.close();

    }



}
