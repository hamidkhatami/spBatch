package com.example;

import org.springframework.batch.item.ItemProcessor;

/**
 * @author khatami ( khatami@caspco.ir)
 * @version 1.0 2024.0605
 * @createDate 7/7/2025
 * @since 1.0
 */
public class UserItemProcessor  implements ItemProcessor<User, User> {
    @Override
    public User process(User user) throws Exception {
        // فقط کاربران فعال رو عبور بده
        return user.isActive() ? user : null;
    }

}
