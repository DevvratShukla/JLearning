package io.github.devvratplus.java.concepts.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UnderstandingImplementingIterable {

	public static void main(String[] args) {
		LinkedList<String> urls = new LinkedList<String>();
		urls.add("http://en.wikipedia.org/wiki/Isaac_Newton");
		urls.add("http://en.wikipedia.org/wiki/Albert_Einstein");
		urls.add("http://en.wikipedia.org/wiki/Richard_Feynman");
		urls.add("http://en.wikipedia.org/wiki/Nikola_Tesla");
		
		HTMLFromURL htmls = new HTMLFromURL(urls);
		
		// Since HTMLFromURL implements Iterable 
		// we can iterate through it via for each
		for(String url : htmls){
			System.out.println(url.length());
		}
	}
}

class HTMLFromURL implements Iterable<String>{
	private LinkedList<String> urls = new LinkedList<String>();
	
	private class UrlIterator implements Iterator<String>{
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {

            StringBuilder sb = new StringBuilder();
            
            try {
                URL url = new URL(urls.get(index));
                
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                
                String line = null;
                
                while( (line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("n");
                }
                                
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            index++;
            
            return sb.toString();
		}
		
		@Override
		public void remove(){
			urls.remove(index);
		}
		
	}
	
	public HTMLFromURL(LinkedList<String> urls) {
		this.urls = urls;
	}

	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}
	
}
