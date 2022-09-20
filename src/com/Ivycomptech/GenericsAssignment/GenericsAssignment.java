package com.Ivycomptech.GenericsAssignment;
import java.util.List;
import java.util.ArrayList;
public class GenericsAssignment {
    /*
Generics Java
Design a class that acts as a library for the following kinds of media: book, video, and newspaper. Provide one version of the class that uses generics and one that does not




     */


        private List resources = new ArrayList();
        public void addMedia(Media x) {
            resources.add(x);
        }
        public Media retrieveLast() {
            int size = resources.size();
            if (size > 0) {
                return (Media)resources.get(size - 1);
            }
            return null;
        }
    }

    interface Media {
    }

    interface Book extends Media {
    }

    interface Video extends Media {
    }

    interface Newspaper extends Media {
    }

