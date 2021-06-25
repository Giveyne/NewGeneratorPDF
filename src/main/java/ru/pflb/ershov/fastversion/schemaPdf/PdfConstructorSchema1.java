package ru.pflb.ershov.fastversion.schemaPdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class PdfConstructorSchema1 {

//    public static void manipulatePdf(String src, String dest) throws DocumentException, IOException {
//        PdfReader reader = new PdfReader(src);
//        FileOutputStream stream = new FileOutputStream(dest);
//        PdfStamper stamper = new PdfStamper(reader, stream);
//        for (int i = 0; i<10000; i++) {
//            TextField tf = new TextField(stamper.getWriter(),
//                    new Rectangle(0, 0, 0, 0), "text");
//            tf.setBorderColor(BaseColor.WHITE);
//            tf.setBorderWidth(0);
//            tf.setTextColor(BaseColor.WHITE);
//            tf.setFontSize(0);
//            tf.setText("Text field");
//            PdfFormField field = tf.getTextField();
//            stamper.addAnnotation(field, 1);
//        }
//        stamper.close();
//        reader.close();
//        stream.close();
//    }
    public static void createSchema() throws IOException, DocumentException {

        BaseFont times = BaseFont.createFont("c:/windows/fonts/times.ttf","cp1251",BaseFont.EMBEDDED);
        Font fontBold11 = new Font(times, 11, Font.BOLD);
        Font fontNormal10 = new Font(times, 10);
        Font fontNormal11 = new Font(times, 11);
        Font fontItalic11 = new Font(times, 11, Font.ITALIC);
        Document document = new Document(PageSize.A4, 80, 50, 60, 50);
        FileOutputStream stream = new FileOutputStream("file_in_program.pdf");
        PdfWriter writer = PdfWriter.getInstance(document, stream);
        document.open();

      /*  Paragraph paragraph1 = new Paragraph();

        paragraph1.setSpacingBefore(50);

        document.add(paragraph1);*/

        Paragraph para = new Paragraph("ПРОТОКОЛ №33\nВнеочередного общего собрания участников\n Общества с ограниченной ответственностью «ПАР» (далее - Общество)\n\n\n",fontBold11);
        para.setAlignment(Element.ALIGN_CENTER);
        para.setLeading(12.1f);
        document.add(para);
        Paragraph para2 = new Paragraph(PARAGRAF_2, fontNormal10);
        para2.setAlignment(Element.ALIGN_LEFT);
        para2.setLeading(12.1f);
        document.add(para2);
        Paragraph para3 = new Paragraph(PARAGRAF_3, fontBold11);
        para3.setAlignment(Element.ALIGN_LEFT);
        para3.setLeading(12.1f);
        document.add(para3);
        Paragraph para4 = new Paragraph( "Повестка дня:", fontNormal11);
        para4.setAlignment(Element.ALIGN_CENTER);
        para4.setLeading(12.1f);
        document.add(para4);
        Paragraph para5 = new Paragraph(PARAGRAF_5, fontNormal11);
        para5.setAlignment(Element.ALIGN_LEFT);
        para5.setLeading(12.1f);
        para5.setIndentationLeft(40f);
        document.add(para5);
        Paragraph para6 = new Paragraph(PARAGRAF_6, fontBold11);
        para6.setAlignment(Element.ALIGN_LEFT);
        para6.setLeading(12.1f);
        document.add(para6);
        Paragraph para7 = new Paragraph(PARAGRAF_7, fontNormal11);
        para7.setAlignment(Element.ALIGN_LEFT);
        para7.setLeading(12.5f);
        document.add(para7);
        Paragraph para8 = new Paragraph(PARAGRAF_8, fontBold11);
        para8.setAlignment(Element.ALIGN_LEFT);
        para8.setLeading(12.5f);
        document.add(para8);
        Paragraph para9 = new Paragraph(PARAGRAF_9, fontNormal11);
        para9.setAlignment(Element.ALIGN_LEFT);
        para9.setLeading(12.1f);
        document.add(para9);
        Paragraph para10 = new Paragraph(PARAGRAF_10, fontItalic11);
        para10.setAlignment(Element.ALIGN_LEFT);
        para10.setLeading(12.1f);
        document.add(para10);
        Paragraph para11 = new Paragraph(PARAGRAF_11, fontNormal11);
        para11.setAlignment(Element.ALIGN_LEFT);
        para11.setLeading(12.5f);
        document.add(para11);
        Paragraph para12 = new Paragraph(PARAGRAF_12, fontBold11);
        para12.setAlignment(Element.ALIGN_LEFT);
        para12.setLeading(12.5f);
        document.add(para12);
        Paragraph para13 = new Paragraph(PARAGRAF_13, fontNormal11);
        para13.setAlignment(Element.ALIGN_LEFT);
        para13.setLeading(12.5f);
        document.add(para13);
        Paragraph para14 = new Paragraph(PARAGRAF_14, fontBold11);
        para14.setAlignment(Element.ALIGN_LEFT);
        para14.setLeading(12.5f);
        document.add(para14);
        Paragraph para15 = new Paragraph(PARAGRAF_15, fontNormal11);
        para15.setAlignment(Element.ALIGN_LEFT);
        para15.setLeading(12.5f);
        document.add(para15);
//********************Пока не трогать может пригодится***********************
       /* Font fontFactory = FontFactory.getFont(FontFactory.TIMES, "Cp1251", false, 11, Font.BOLD, new CMYKColor(0,233,33,255));
        Font font = new Font(times,11f, Font.BOLD, new CMYKColor(0, 233, 33,0));
        Phrase chunk = new Phrase("Привет ", fontFactory);
        document.add(chunk);
        document.add(chunk);
        document.add(chunk);
        String[] strings = PARAGRAF_2.split(" ");
        int i=0;
        for (String s: strings){
            i++;
            if (i==256){
                i=0;
            }
            font.setColor(new CMYKColor(0, i, i,0));
            Phrase chunk1 = new Phrase(s+" ", font);
            document.add(chunk1);
        }*/


        document.close();
        writer.close();
        stream.close();

       // manipulatePdf("file_out_program.pdf", "1file_out_program.pdf");

    }
    final static String PARAGRAF_2 = "Дата, место и время проведения собрания: «29» января 2016 г., г, Москва, улица Айвазовского, д 1,\n" +
            "с 10: 00 до 11:00 ч.\n" +
            "На собрании присутствовали участники Общества, владеющие 100% долей в уставном капитале Общества.\n" +
            "Дата составления протокола: «29» января 2016 года.\n\n" +
            "На собрании присутствуют участники:\n" +
            "1. Иванов Александр Александрович (паспорт 11 11 111111, выдан ОУФМС г.\n" +
            "Москвы 02.02.1990 г., зарегистрирован по адресу: г. Москва, ул. Пушкина, д, 2,\n" +
            "кв.1), доля -48 % уставного капитала Общества;\n" +
            "2. Петрова Ольга Ивановна (паспорт 11 11 111111, выдан\n" +
            "ОУФМС г. Москвы 02.02.1990 г., зарегистрирован по адресу: г. Москва,\n" +
            "ул. Пушкина, д,1, кв. 1), доля -48 % уставного капитала Общества.\n" +
            "3. Петрушкин Виктор Петрович, 01 января 1990 года рождения, паспорт гражданина РФ 11 11 111111,\n" +
            "выдан ОУФМС г. Москвы 02.02.1990 г., код подразделения 111-111,\n" +
            "зарегистрированный по адресу: г. Москва, ул. Пушкина, дом 1, корпус 1, квартира 8, владеющий долей\n" +
            "в размере 4% уставного капитала Общества.\n\n" +
            "Кворум имеется, собрание правомочно принимать решения.\n\n";
    final static String PARAGRAF_3 = "Председателем собрании избран: Иванов А.А.\n"+
                                    "Секретарем собрания и лицом, ответственным за подсчет голосов избран: Петрушкин В.П.\n\n\n";
    final static String PARAGRAF_5 = "1. Одобрение порядка подтверждения решения Общего собрания участников Общества.\n"+
                                    "2. Избрание на должность Директора Общества\n\n";
    final static String PARAGRAF_6 = "    По первому вопросу повестки дня «О порядке подтверждения решения Общего\n"+
                                    "собрания участников Общества»\n\n";

    final static String PARAGRAF_7 = "             СЛУШАЛИ; Петрушкин В.П,\n\n" +
            "            ПРЕДЛОЖИЛИ: Одобрить ненотариальный порядок подтверждения решения Общего\n" +
            "собрания участников Общества путем проставления собственноручных подписей участников (в\n" +
            "том числе в липе уполномоченного представителя) Общества на настоящем протоколе.\n\n" +
            "            ГОЛОСОВАЛИ:\n" +
            "    Варианты           Участник, проголосовавший за данный вариант голосования\n" +
            "    голосования\n" +
            "    \"за\" - 3\n" +
            "    \"против\" - 0\n" +
            "    \"воздержались\" - 0\n\n" +
            "            РЕШИЛИ: Одобрить ненотариальный порядок подтверждения решения Общего собрания\n" +
            "участников Общества путем проставления собствен по ручных подписей участников (в том числе\n" +
            "в лице уполномоченного представителя) Общества на настоящем протоколе.\n\n\n";
    final static String PARAGRAF_8 = "       По второму вопросу повестки дня";
    final static String PARAGRAF_9 = "СЛУШАЛИ: Иванов А.А, который сообщил о том, что 02.02,2016г. истекает срок\n" +
            "полномочий Директора Общества Мельникова В.И. и предложил избрать Мельникова В.И. на\n" +
            "новый срок.\n\n\n";
    final static String PARAGRAF_10 ="В силу п. 3 ст. 45 ФЗ «Об обществах с ограниченной ответственностью» голос Иванова А.А.\n" +
            "при голосовании по данному вопросу повестки дня не учитывается.\n\n";
    final static String PARAGRAF_11 ="          ГОЛОСОВАЛИ:\n" +
            "   Варианты\n" +
            "   голосования\n" +
            "   \"за\" - 2\n" +
            "   \"против\" - 0\n" +
            "   \"воздержались\" — 0\n\n\n";
    final static String PARAGRAF_12 ="           Решение по второму вопросу повестки дня принято.\n\n";
    final static String PARAGRAF_13 ="          РЕШИЛИ:\n" +
            "1.В связи с истечением срока полномочий избратьМельниковаВ.И. на должность Директора\n" +
            "Общества на новый срок с 03.02.2016г. сроком на 1 (один) год.\n" +
            "2. На основании ст. 79 Трудового кодекса РФ прекратить 02.02.2016г. действие трудового\n" +
            "договора №01 от 02.02.2015г., заключенного между Обществом иМельниковым В.И..\n" +
            "3. Уполномочить Иванова Ⱥ.Ⱥ. подписать от имени Общества трудовой договор с\n" +
            "Мельникова В.И. на новый срок.\n\n\n";
    final static String PARAGRAF_14 ="          ПОДПИСИ УЧАСТНИКОВ:\n\n";
    final static String PARAGRAF_15 ="___________________Иванов А.А. (Председатель собрания)\n\n\n"+
            "___________________Петрушкин В.П. (Секретарь собрания)\n\n\n"+
            "__________________Мельникова В.И.\n";
}



