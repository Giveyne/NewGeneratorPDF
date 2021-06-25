package ru.pflb.ershov.fastversion.schemaPdf;


import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PdfConstructorSchema3 {
    public static void createSchema3(int countPage) throws IOException, DocumentException {

        BaseFont times = BaseFont.createFont("c:/windows/fonts/times.ttf", "cp1251", BaseFont.EMBEDDED);
        BaseFont arial = BaseFont.createFont("c:/windows/fonts/arial.ttf", "cp1251", BaseFont.EMBEDDED);
        Font fontBold11 = new Font(times, 11, Font.BOLD);
        Font fontArialBold11 = new Font(times, 10, Font.NORMAL);
        Font fontNormal15 = new Font(times, 15);
        Font fontNormal14 = new Font(times, 14);
        Font fontBold10 = new Font(times, 10, Font.BOLD);
        Font fontBold14_5 = new Font(times, 14.5f, Font.BOLD);
        Font fontBold14 = new Font(times, 14, Font.BOLD);
        Font fontBold25_5 = new Font(times, 25.5f, Font.BOLD);
        Font fontNormal10 = new Font(times, 10);
        fontNormal10.getCalculatedLeading(16f);
        Font fontNormal11 = new Font(times, 11);
        Font fontItalic11 = new Font(times, 11, Font.ITALIC);
        Document document = new Document(PageSize.A4, 55, 50, 55, 50);
        FileOutputStream stream = new FileOutputStream("schema3_"+countPage+".pdf");
        PdfWriter writer = PdfWriter.getInstance(document, stream);
        document.open();
        Paragraph para0 = new Paragraph(PARAGRAF_0, fontArialBold11);
        para0.setAlignment(Element.ALIGN_CENTER);
        para0.setLeading(12.0f);

        document.add(para0);


        Paragraph para2 = new Paragraph(PARAGRAF_2, fontNormal10);
        para2.setAlignment(Element.ALIGN_CENTER);
        para2.setLeading(12.0f);
        document.add(para2);
        Phrase phrase = new Phrase("Я,", fontNormal10);
        phrase.setLeading(5f);
        document.add(phrase);
        float [] pointColumnWidths = {155F, 155F};
        PdfPTable table = new PdfPTable(pointColumnWidths);
        table.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.setWidthPercentage(530 / 5.23f);

        Phrase phrase1 = new Phrase("  Должность единоличного исполнительного органа", fontNormal10);

        PdfPCell cell = new PdfPCell(phrase1);
        cell.setLeading(16.0f, -0.6f);
        table.addCell(cell);
        PdfPCell cellTwo = new PdfPCell(new Phrase(" пусто", fontNormal10));
        cellTwo.setLeading(16.0f, -0.6f);
        table.addCell(cellTwo);
        PdfPCell cell3 = new PdfPCell(new Phrase(" ФИО единоличного исполнительного органа" , fontNormal10));
        cell3.setLeading(16.0f, -0.6f);
        table.addCell(cell3);
        PdfPCell cell4 = new PdfPCell(new Phrase(" пусто  пусто  пусто" , fontNormal10));
        cell4.setLeading(16.0f, -0.6f);
        table.addCell(cell4);
        document.add(table);

        Paragraph parann = new Paragraph("\n", fontBold10);
        parann.setAlignment(Element.ALIGN_LEFT);
        parann.setLeading(10.0f);
        document.add(parann);

        Paragraph para1 = new Paragraph("\nдействующий на основании Устава от имени\n\n", fontNormal10);
        para1.setAlignment(Element.ALIGN_LEFT);
        para1.setLeading(5.0f);
        document.add(para1);

        PdfPTable table2 = new PdfPTable(pointColumnWidths);
        table2.setHorizontalAlignment(Element.ALIGN_CENTER);
        table2.setWidthPercentage(530 / 5.23f);
        PdfPCell cell5 = new PdfPCell(new Phrase("  Наименование юридического лица" , fontNormal10));
        cell5.setLeading(16.0f, -0.6f);
        table2.addCell(cell5);
        PdfPCell cell6 = new PdfPCell(new Phrase("  Акционерное общество \"МОРС\"" , fontNormal10));
        cell6.setLeading(16.0f, -0.6f);
        table2.addCell(cell6);
        PdfPCell cell7 = new PdfPCell(new Phrase("  Общество является публичным акционерным\n" +
                "  обществом" , fontNormal10));
        cell7.setLeading(16f, -0.5f);
        table2.addCell(cell7);

        Phrase phrase2 = new Phrase("Нет", fontNormal10);

        PdfPCell cell8 = new PdfPCell(phrase2);
        cell8.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell8.setLeading(20f, -0.5f);
        table2.addCell(cell8);
        document.add(table2);


        Paragraph para3 = new Paragraph("\n(далее – Общество), подтверждаю ПАО Сбербанк, что по состоянию на дату 14.08.2020:\n\n\n", fontNormal10);
        para3.setAlignment(Element.ALIGN_LEFT);
        para3.setLeading(12.0f);
        document.add(para3);

        float [] pointColumnWidths2 = {15F, 245F, 43f};
        PdfPTable table3 = new PdfPTable(pointColumnWidths2);
        table3.setHorizontalAlignment(Element.ALIGN_CENTER);
        table3.setWidthPercentage(540 / 5.25f);

        PdfPCell cell_3_1 = new PdfPCell(new Phrase("№", fontNormal10));
        cell_3_1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell_3_1.setLeading(14f, -0.5f);
        table3.addCell(cell_3_1);
        PdfPCell cell_3_2 = new PdfPCell(new Phrase("ЗАВЕРЕНИЯ И ГАРАНТИИ", fontNormal10));
        cell_3_2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell_3_2.setLeading(14f, -0.5f);
        table3.addCell(cell_3_2);
        PdfPCell cell_3_3 = new PdfPCell();
        cell_3_3.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell_3_3.setLeading(14f, -0.5f);
        table3.addCell(cell_3_3);
        List<String>listNumbers = new ArrayList(Arrays.asList("1", "2", "3", "4", "4а","4б", "5","5a", "6","6a", "7", "8", "9", "10",
                "11","12", "13", "14","15", "16", "17","18"));
        for (int ind1 = 1; ind1 <= TABLE_3.length; ind1++) {


            PdfPCell cell_3_4 = new PdfPCell(new Phrase(listNumbers.get(ind1-1),fontNormal10));
            cell_3_4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell_3_4.setLeading(17.0f, -0.5f);
            table3.addCell(cell_3_4);
            PdfPCell cell_3_5 = new PdfPCell(new Phrase(TABLE_3[ind1-1][0],fontNormal10));
            cell_3_5.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell_3_5.setLeading(17.0f, -0.5f);
            table3.addCell(cell_3_5);
            PdfPCell cell_3_6 = new PdfPCell(new Phrase(TABLE_3[ind1-1][1],fontNormal10));
            cell_3_6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell_3_6.setLeading(17.0f, -0.5f);
            table3.addCell(cell_3_6);
        }

//        int countNumber = TABLE_3.length;
//
//        for (int ind2 = 0; ind2<TABLE_3.length; ind2++){
//
//            for (int ind1 = 0; ind1 < TABLE_3.length-4; ind1++) {
//                countNumber++;
//                PdfPCell cell_3_4 = new PdfPCell(new Phrase(String.valueOf(countNumber), fontNormal10));
//                cell_3_4.setHorizontalAlignment(Element.ALIGN_CENTER);
//                cell_3_4.setLeading(18.0f, -0.5f);
//                table3.addCell(cell_3_4);
//                PdfPCell cell_3_5 = new PdfPCell(new Phrase(TABLE_3[ind1][0], fontNormal10));
//                cell_3_5.setHorizontalAlignment(Element.ALIGN_LEFT);
//                cell_3_5.setLeading(18.0f, -0.5f);
//                table3.addCell(cell_3_5);
//                PdfPCell cell_3_6 = new PdfPCell(new Phrase(TABLE_3[ind1][1], fontNormal10));
//                cell_3_6.setHorizontalAlignment(Element.ALIGN_CENTER);
//                cell_3_6.setLeading(18.0f, -0.5f);
//                table3.addCell(cell_3_6);
//            }
//        }
        document.add(table3);

        for (int ind3 = 0; ind3<countPage*12+1; ind3++) {
            Paragraph para4 = new Paragraph(PARAGRAF_3, fontNormal10);
            para4.setAlignment(Element.ALIGN_LEFT);
            para4.setLeading(15.2f);
            document.add(para4);
        }

        Paragraph nullParagraf = new Paragraph(" ", fontBold14);
        nullParagraf.setAlignment(Element.ALIGN_CENTER);
        nullParagraf.setLeading(300.5f);
        document.add(nullParagraf);

        Paragraph para5 = new Paragraph(PARAGRAF_4, fontNormal10);
        para5.setAlignment(Element.ALIGN_LEFT);
        para3.setLeading(12.0f);
        document.add(para5);

        document.close();
        writer.close();
        stream.close();
    }
    final static String PARAGRAF_0="ЗАВЕРЕНИЯ И ГАРАНТИИ\n";
    final static String PARAGRAF_2 ="(для акционерного общества)\n\n\n";
    final static String[][] TABLE_3 =  {{"Уставом предусмотрен срок действия Общества ","Нет"},
                                        {"Уставный капитал оплачен в полном объеме ","Да"},
                                        {"Общество находится в процедуре реорганизации (в т.ч. на стадии принятия решения ореорганизации)","Нет"},
                                        {"Акции, эмитентом которых является Общество, обременены залогом","Нет"},
                                        {"Лицом, осуществляющим корпоративные права акционера по заключенному договору" +
                                                "залога акций, является сам акционер\n" +
                                                "(ст. 358.15 Гражданского кодекса Российской Федерации)",""},
                                        {"Заключался ли договор управления залогом\n" +
                                                "(ст. 356 Гражданского кодекса Российской Федерации)",""},
                                        {"В Обществе заключено (заключается) между акционерами и/или акционерами Общества и" +
                                                "третьими лицами акционерное соглашение/корпоративный (аналогичный корпоративному)" +
                                                "договор\n" +
                                                "(ст. 32.1 Федерального закона от 26.12.1995 № 208-ФЗ «Об акционерных" +
                                                "обществах»/ст. 67.2 Гражданского кодекса Российской Федерации)","Нет"},
                                        {"Сделка с Банком противоречит заключаемому/имеющемуся акционерному соглашению/" +
                                                "корпоративному (аналогичному корпоративному) договору",""},
                                        {"В Обществе избран совет директоров/наблюдательный совет\n" +
                                                "(ст. 64 Федерального закона от 26.12.1995 № 208-ФЗ «Об акционерных обществах»)","Нет"},
                                        {"В Обществе был сформирован совет директоров/наблюдательный совет на дату избрания" +
                                                "единоличного исполнительного органа","Нет"},
                                        {"В Обществе избран коллегиальный исполнительный орган (Общее собрание участников," +
                                                "совет директоров/наблюдательный совет НЕ являются коллегиальными исполнительными" +
                                                "органами)\n" +
                                                "(ст. 70 Федерального закона от 26.12.1995 № 208-ФЗ «Об акционерных обществах»)","Нет"},
                                        {"В Обществе полномочия единоличного исполнительного органа предоставлены" +
                                                "нескольким лицам, действующим совместно, или образовано несколько единоличных" +
                                                "исполнительных органов, действующих независимо друг от друга в соответствии с уставом" +
                                                "Общества (множественность ЕИО)\n" +
                                                "(абз. 3 п. 1 ст. 69 Федерального закона от 26.12.1995 № 208-ФЗ «Об акционерных" +
                                                "обществах»)","Нет"},
                                        {"Полномочия единоличного исполнительного органа Общества переданы управляющей" +
                                                "организации или управляющему\n" +
                                                "(абз. 3 п. 1 ст. 69 Федерального закона от 26.12.1995 № 208-ФЗ «Об акционерных\n" +
                                                "обществах»)\n","Нет"},
                                        {"Совершение сделки с Банком является для Общества крупной сделкой\n" +
                                                "(ст. 78 Федерального закона от 26.12.1995 № 208-ФЗ «Об акционерных обществах»)","Нет"},
                                        {"Согласно уставу Общества и/или иным регулирующим деятельность Общества" +
                                                "документам сделка с Банком подлежит одобрению советом директоров (наблюдательным" +
                                                "советом) Общества/общим собранием участников Общества (ст. 69 Федерального закона" +
                                                "от 26.12.1995 № 208-ФЗ «Об акционерных обществах») и/или материнским обществом по" +
                                                                            "основаниям, отличающимся от определенных в законодательстве Российской Федерации","Нет"},
                                        {"Обществом утверждены внутренние нормативные документы, регулирующие порядок\n" +
                                                "работы органов управления, предусмотренные уставом ","Нет"},
                                        {"В совершении сделки с Банком имеется заинтересованность согласно ст. 81 Федерального\n" +
                                                "закона от 26.12.1995 № 208-ФЗ «Об акционерных обществах» ","Нет"},
                                        {"Устав Общества содержит сведения об использовании в отношении Общества" +
                                                "специального права на участие Российской Федерации, субъекта Российской Федерации" +
                                                "или муниципального образования в управлении Обществом («золотая акция»)\n" +
                                                "(абз. 12 п. 3 ст. 11 Федерального закона от 26.12.1995 № 208-ФЗ «Об акционерных" +
                                                "обществах») ","Нет"},
                                        {"Устав Общества содержит порядок одобрения сделок с заинтересованностью, отличный от" +
                                                "установленного Федеральным законом от 26.12.1995 № 208-ФЗ «Об акционерных обществах»\n" +
                                                "(п. 8 ст. 83 Федерального закона от 26.12.1995 № 208-ФЗ «Об акционерных обществах») ","Нет"},
                                        {"Устав Общества содержит положения, предоставляющие акционерам дополнительные\n" +
                                                "права\n" +
                                                "(п. 6 ст. 32 Федерального закона от 26.12.1995 № 208-ФЗ «Об акционерных обществах») ","Нет"},
                                        {"Обществом получено добровольное или обязательное предложение о приобретении акций\n" +
                                                "Общества\n" +
                                                "(гл. XI.I Федерального закона от 26.12.1995 № 208-ФЗ «Об акционерных обществах») ","Нет"},
                                        {"Обществом составляется ежемесячная бухгалтерская отчетность ","Нет"}
                                      };
    final static String PARAGRAF_3 = "   В отношении Общества не применяются процедуры, применяемые в деле о банкротстве. Общество не имеет " +
            "признаков неплатежеспособности или недостаточности имущества, не находится в процедуре ликвидации и " +
            "способно выполнять свои обязательства перед кредиторами. Заключение Обществом сделки с ПАО Сбербанк не " +
            "причиняет вред имущественным правам кредиторов Общества. ";
    final static String PARAGRAF_4 ="Документ сформирован в Сбербанк Бизнес Онлайн";
}
