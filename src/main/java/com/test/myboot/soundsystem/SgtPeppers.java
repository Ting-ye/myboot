package com.test.myboot.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author ting
 * @date 2021/4/15 下午2:03
 */
@Component
public class SgtPeppers implements CompactDisc{
    @Override
    public void play() {
        System.out.println("Playing SgtPeppers");
    }
}
