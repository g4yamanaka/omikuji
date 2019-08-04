package com.example.demo.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class OmikuziService {
    public String getResult() {
        String resultMsg = "";
        Random random = new Random();
        int num = 0;

        num = random.nextInt(3);
        switch (num) {
        case 0:
            resultMsg = "大吉";
            break;
        case 1:
            resultMsg = "中吉";
            break;
        case 2:
            resultMsg = "小吉";
            break;
        default:
            resultMsg = "凶";
        }
//        if (num == 0) {
//            resultMsg = "大吉";
//        } else if (num == 1) {
//            resultMsg = "中吉";
//        } else if (num == 2) {
//            resultMsg = "小吉";
//        } else {
//            resultMsg = "凶";
//        }

        return resultMsg;
    }

    public String getResultComment(String result) {
        String resultComment = "";

        final String DAIKICHI_COMMENT = "大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。大吉です！きっと明日はいい天気になります。ラッキーカラーは緑です。";
        final String TYUKICHI_COMMENT = "中吉です、いつも以上に楽しく過ごせるでしょう";
        final String SYOKICHI_COMMENT = "小吉です、いつものように穏やかに過ごせるでしょう";
        final String KYO_COMMENT = "凶です、忘れ物など身の回りには要注意・・・";

        if (result == "大吉") {
            resultComment = DAIKICHI_COMMENT;
        } else if (result == "中吉") {
            resultComment = TYUKICHI_COMMENT;
        } else if (result == "小吉") {
            resultComment = SYOKICHI_COMMENT;
        } else if (result == "凶") {
            resultComment = KYO_COMMENT;
        }

        return resultComment;
    }
}
