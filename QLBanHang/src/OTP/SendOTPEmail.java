package OTP;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class SendOTPEmail {
    // Phương thức gửi OTP qua email
    public void sendOTPEmail(String Email) {
        // Thông tin tài khoản Gmail của bạn
        final String username = "hieuhoangg2204@gmail.com";  // Địa chỉ email của bạn
        final String password = "lulggrjcumjjkcfp";   // Mật khẩu ứng dụng Gmail (không phải mật khẩu tài khoản)

        // Cấu hình thông số SMTP
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // Sử dụng TLS

        // Tạo session với thông tin tài khoản và mật khẩu
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Tạo nội dung email
            String otp = generateOTP(); // Hàm để tạo OTP
            String recipientEmail = Email; // Email người nhận
            String subject = "Your OTP Code";
            String messageContent = "Your OTP code is: " + otp;

            // Tạo email
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(subject);
            message.setText(messageContent);

            // Gửi email
            Transport.send(message);
            System.out.println("OTP sent successfully to " + recipientEmail);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    // Hàm tạo OTP ngẫu nhiên
    private String generateOTP() {
        int otp = (int) (Math.random() * 1000000); // Tạo OTP ngẫu nhiên
        return String.format("%06d", otp);  // Đảm bảo OTP có 6 chữ số
    }
}
