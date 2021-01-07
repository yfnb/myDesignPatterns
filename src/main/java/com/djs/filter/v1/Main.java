package com.djs.filter.v1;

public class Main {

    public static void main(String[] args) {

        Msg msg=new Msg();
        msg.setName("小红");
        msg.setMsg("大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996 ");

        FilterChain filterChain=new FilterChain();

        Filter filter1=new HTMLFilter();
        Filter filter2 = new SensitiveFilter();

        filterChain.add(filter1);
        filterChain.add(filter2);
        FilterChain filterChain2 = new FilterChain();

        filterChain2.add(new URLFilter());

        filterChain.add(filterChain2);

        filterChain.doFilter(msg);

        System.out.println(msg);



    }
}
