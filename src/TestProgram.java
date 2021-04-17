import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        String s = "<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\"%>\n" +
                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>Insert title here</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<tbody>\n" +
                "   <tr>\n" +
                "      <td style=\"text-align:center\" width=\"145\">\n" +
                "         <p>Mã</p>\n" +
                "      </td>\n" +
                "      <td style=\"text-align:center\" width=\"370\">\n" +
                "         <p>Tên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      </td>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong>0001</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>Kho bạc Nhà nước</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      </td>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong>0002</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>Trung tâm thanh toán - KBNN</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong>0003</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>Sở GD- KBNN</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong>0010</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong> KBNN Hà Nội</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0011</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>VP KBNN Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0012</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Ba Đình - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0013</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hoàn Kiếm - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0014</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hai Bà Trưng - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0015</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Đống Đa - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0016</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Long Biên - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0018</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thanh Trì - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0019</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Sóc Sơn - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0020</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Đông Anh - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0021</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Tây Hồ - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0022</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thanh Xuân - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0023</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Cầu giấy - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0024</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Gia Lâm - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0025</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hoàng Mai - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0026</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hà Đông - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0027</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Phú Xuyên - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0028</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Mỹ Đức - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0029</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Ứng Hoà - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0030</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thường Tín - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0031</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quốc Oai - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0032</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Chương Mỹ - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0033</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Sơn Tây - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0034</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Ba Vì - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0035</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Đan Phượng - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0036</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hoài Đức - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0037</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Phúc Thọ - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0038</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thạch Thất - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0039</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thanh Oai - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0040</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Mê Linh - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0041</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Bắc Từ Liêm - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0042</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Nam Từ Liêm - Hà Nội</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong> 0060</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>KBNN Hải Phòng</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0061</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>VP KBNN Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0062</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Ngô Quyền - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0063</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hồng Bàng - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0064</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Lê Chân - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0065</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Kiến An - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0066</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Đồ Sơn - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0067</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Tiên Lãng - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0068</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN An Dương - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0069</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Vĩnh Bảo - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0070</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thuỷ Nguyên - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0071</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN An Lão - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0072</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Kiến Thuỵ - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0073</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Cát Hải - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0075</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hải An - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0076</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Dương Kinh - Hải Phòng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      \n" +
                "         <p><strong>52 </strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong> 0110</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>KBNN TP Hồ Chí Minh</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0111</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>VP KBNN Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0112</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 3 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0113</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 4 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0114</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 5 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0115</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 6 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0116</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 8 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0117</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 10 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0118</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 11 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0119</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Q. Phú Nhuận - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0120</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Q.Bình Thạnh - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0121</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Gò Vấp - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0122</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Tân Bình - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0123</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thủ Đức - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0124</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hóc Môn - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0125</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Nhà Bè - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0126</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Bình Chánh - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0127</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Củ Chi - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0128</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Cần giờ - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0129</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 2 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0130</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 7 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0131</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 9 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0132</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 12 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0133</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quận 1 - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0134</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KNNN Bình Tân - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0135</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Tân Phú - TP Hồ Chí Minh</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      \n" +
                "         <p><strong>78 </strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong> 0160</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>KBNN Đà Nẵng</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0161</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>VP KBNN Đà Nẵng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0162</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hoà Vang - Đà Nẵng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0163</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thanh Khê - Đà Nẵng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0164</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Sơn Trà - Đà Nẵng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0165</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Ngũ Hành Sơn - Đà Nẵng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0166</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Liên Chiểu - Đà Nẵng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0167</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hải Châu- Đà Nẵng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0168</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Cẩm Lệ- Đà Nẵng</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      \n" +
                "         <p><strong>87 </strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong>0260 </strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>KBNN Nam Định</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0261</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>VP KBNN Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0262</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Xuân Trường - Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0263</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Nghĩa Hưng - Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0264</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hải Hậu - Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0265</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Vụ Bản - Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0266</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Ý Yên - Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0267</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Trực Ninh - Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0268</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Mỹ Lộc - Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0269</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Giao Thuỷ - Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0270</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Nam Trực - Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0271</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN TP Nam Định - Nam Định</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      \n" +
                "         <p><strong>99 </strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong>0310</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>KBNN Hà Nam</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0311</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>VP KBNN Hà Nam</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0312</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Bình Lục - Hà Nam</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0313</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Kim Bảng - Hà Nam</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0314</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Lý Nhân - Hà Nam</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0315</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Duy Tiên - Hà Nam</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0316</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thanh Liêm - Hà Nam</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0317</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>Phòng Giao dịch - KBNN Hà Nam</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      \n" +
                "         <p><strong>107 </strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong>0360</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>KBNN Hải Dương</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0361</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>VP KBNN Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0362</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thanh Miện - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0363</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Nam Sách - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0364</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Kim Thành - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0365</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Cẩm Giàng - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0366</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Chí Linh - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0367</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Gia Lộc - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0368</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Ninh Giang - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0369</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Tứ Kỳ - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0370</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Bình Giang - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0371</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thanh Hà - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0372</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Kinh Môn - Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0373</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>Phòng Giao dịch - KBNN Hải Dương</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      \n" +
                "         <p><strong>121 </strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"145\"></td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>KBNN Hưng Yên</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      \n" +
                "         <p><strong>122 </strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong>0411</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>VP KBNN Hưng Yên</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0412</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Mỹ Hào - Hưng Yên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0413</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Ân Thi - Hưng Yên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0414</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Tiên Lữ - Hưng Yên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0415</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Khoái Châu - Hưng Yên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0416</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Phù Cừ - Hưng Yên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0417</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Văn Lâm - Hưng Yên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0418</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Yên Mỹ - Hưng Yên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0419</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Văn Giang - Hưng Yên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0420</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Kim Động - Hưng Yên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0421</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>Phòng Giao dịch - KBNN Hưng Yên</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      \n" +
                "         <p><strong>133 </strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong> 0460</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>KBNN Thái Bình</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0461</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>VP KBNN Thái Bình</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0462</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Tiền Hải - Thái Bình</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0463</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Quỳnh Phụ - Thái Bình</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0464</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Đông Hưng - Thái Bình</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0465</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Thái Thuỵ - Thái Bình</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0466</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Vũ Thư - Thái Bình</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0467</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Kiến Xương - Thái Bình</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0468</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>KBNN Hưng Hà - Thái Bình</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p>0469</p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p>Phòng Giao dịch - KBNN Thái Bình</p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "   <tr>\n" +
                "      <td width=\"145\">\n" +
                "         <p><strong>0510</strong></p>\n" +
                "      </td>\n" +
                "      <td width=\"370\">\n" +
                "         <p><strong>KBNN Long An</strong></p>\n" +
                "      </td>\n" +
                "   </tr>\n" +
                "</tbody>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n" +
                "\n";
        s=s.replaceAll("\n" +
                "      \n" +
                "         <p><strong>"+ "\\d{1,3}" + " </strong></p>\n" +
                "      </td>", "");
        System.out.println(s);
        String x = "\n" +
                "      \n" +
                "         <p>3</p>\n" +
                "      </td>";
    }
}
