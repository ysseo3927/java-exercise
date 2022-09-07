package com.example;

import com.exercise.*;

import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {
        Generic g = new Generic();
        g.<Member>method1(new com.exercise.Member());
        Generic2<Member> t = new Generic2<>();
        t.setT(new Member());
        t.getLog();

        Generic2<NomalMember> t2 = new Generic2<>();
        t2.setT(new NomalMember());
        t2.getLog();
        Generic2<PremiumMember> t3 = new Generic2<>();
        t3.setT(new PremiumMember());
        t3.getLog();



    }

}