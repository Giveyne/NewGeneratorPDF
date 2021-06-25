package ru.pflb.ershov.fastversion.schemaPdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class PdfConstructorSchema2 {
    public static void createSchema2(int count) throws IOException, DocumentException {

        BaseFont times = BaseFont.createFont("c:/windows/fonts/times.ttf", "cp1251", BaseFont.EMBEDDED);
        Font fontBold11 = new Font(times, 11, Font.BOLD);
        Font fontNormal15 = new Font(times, 15);
        Font fontNormal14 = new Font(times, 14);
        Font fontBold30 = new Font(times, 30, Font.BOLD);
        Font fontBold14_5 = new Font(times, 14.5f, Font.BOLD);
        Font fontBold14 = new Font(times, 14, Font.BOLD);
        Font fontBold25_5 = new Font(times, 25.5f, Font.BOLD);
        Font fontNormal10 = new Font(times, 10);
        Font fontNormal11 = new Font(times, 11);
        Font fontItalic11 = new Font(times, 11, Font.ITALIC);
        Document document = new Document(PageSize.A4, 100, 60, 60, 50);
        FileOutputStream stream = new FileOutputStream("schema2_"+count+".pdf");
        PdfWriter writer = PdfWriter.getInstance(document, stream);
        document.open();


        Paragraph para = new Paragraph(PARAGRAF_1, fontNormal15);
        para.setAlignment(Element.ALIGN_RIGHT);
        para.setLeading(12.5f);
        document.add(para);
        Paragraph para2 = new Paragraph(PARAGRAF_2, fontNormal14);
        para2.setAlignment(Element.ALIGN_RIGHT);
        para2.setLeading(12.5f);
        document.add(para2);
        Paragraph para3 = new Paragraph(PARAGRAF_3, fontBold30);
        para3.setAlignment(Element.ALIGN_CENTER);
        para3.setLeading(12.5f);
        document.add(para3);
        Paragraph para4 = new Paragraph(PARAGRAF_4, fontBold14_5);
        para4.setAlignment(Element.ALIGN_CENTER);
        para4.setLeading(15.5f);
        document.add(para4);
        Paragraph para5 = new Paragraph(PARAGRAF_5, fontBold25_5);
        para5.setAlignment(Element.ALIGN_CENTER);
        para5.setLeading(25.5f);
        document.add(para5);
        Paragraph para6 = new Paragraph(PARAGRAF_6, fontBold14);
        para6.setAlignment(Element.ALIGN_CENTER);
        para6.setLeading(12.5f);
        document.add(para6);
        Paragraph nullParagraf = new Paragraph(PARAGRAF_0, fontBold14);
        nullParagraf.setAlignment(Element.ALIGN_CENTER);
        nullParagraf.setLeading(400.5f);
        document.add(nullParagraf);
        Paragraph para7 = new Paragraph(PARAGRAF_7, fontBold14);
        para7.setAlignment(Element.ALIGN_CENTER);
        para7.setLeading(12.5f);
        document.add(para7);
        Paragraph articl1 = new Paragraph(ARTICLE_1, fontBold11);
        articl1.setAlignment(Element.ALIGN_CENTER);
        articl1.setLeading(24.0f);
        document.add(articl1);
        Paragraph para1_1 = new Paragraph(PARAGRAF_1_1, fontNormal11);
        para1_1.setAlignment(Element.ALIGN_LEFT);
        para1_1.setLeading(24.0f);
        document.add(para1_1);
        Paragraph articl2 = new Paragraph(ARTICLE_2, fontBold11);
        articl2.setAlignment(Element.ALIGN_CENTER);
        articl2.setLeading(24.0f);
        document.add(articl2);
        Paragraph para2_1 = new Paragraph(PARAGRAF_2_1, fontNormal11);
        para2_1.setAlignment(Element.ALIGN_LEFT);
        para2_1.setLeading(24.0f);
        document.add(para2_1);
        Paragraph articl3 = new Paragraph(ARTICLE_3, fontBold11);
        articl3.setAlignment(Element.ALIGN_CENTER);
        articl3.setLeading(24.0f);
        document.add(articl3);
        Paragraph para3_1 = new Paragraph(PARAGRAF_3_1, fontNormal11);
        para3_1.setAlignment(Element.ALIGN_LEFT);
        para3_1.setLeading(24.0f);
        document.add(para3_1);
        Paragraph articl4 = new Paragraph(ARTICLE_4, fontBold11);
        articl4.setAlignment(Element.ALIGN_CENTER);
        articl4.setLeading(24.0f);
        document.add(articl4);
        Paragraph para4_1 = new Paragraph(PARAGRAF_4_1, fontNormal11);
        para4_1.setAlignment(Element.ALIGN_LEFT);
        para4_1.setLeading(24.0f);
        document.add(para4_1);
        Paragraph articl5 = new Paragraph(ARTICLE_5, fontBold11);
        articl5.setAlignment(Element.ALIGN_CENTER);
        articl5.setLeading(24.0f);
        document.add(articl5);
        Paragraph para5_1 = new Paragraph(PARAGRAF_5_1, fontNormal11);
        para5_1.setAlignment(Element.ALIGN_LEFT);
        para5_1.setLeading(24.0f);
        document.add(para5_1);
        Paragraph articl6 = new Paragraph(ARTICLE_6, fontBold11);
        articl6.setAlignment(Element.ALIGN_CENTER);
        articl6.setLeading(24.0f);
        document.add(articl6);
        Paragraph para6_1 = new Paragraph(PARAGRAF_6_1, fontNormal11);
        para6_1.setAlignment(Element.ALIGN_LEFT);
        para6_1.setLeading(24.0f);
        document.add(para6_1);
        Paragraph articl7 = new Paragraph(ARTICLE_7, fontBold11);
        articl7.setAlignment(Element.ALIGN_CENTER);
        articl7.setLeading(24.0f);
        document.add(articl7);
        Paragraph para7_1 = new Paragraph(PARAGRAF_7_1, fontNormal11);
        para7_1.setAlignment(Element.ALIGN_LEFT);
        para7_1.setLeading(24.0f);
        document.add(para7_1);
        Paragraph articl8 = new Paragraph(ARTICLE_8, fontBold11);
        articl8.setAlignment(Element.ALIGN_CENTER);
        articl8.setLeading(24.0f);
        document.add(articl8);
        Paragraph para8_1 = new Paragraph(PARAGRAF_8_1, fontNormal11);
        para8_1.setAlignment(Element.ALIGN_LEFT);
        para8_1.setLeading(24.0f);
        document.add(para8_1);
        Paragraph articl9 = new Paragraph(ARTICLE_9, fontBold11);
        articl9.setAlignment(Element.ALIGN_CENTER);
        articl9.setLeading(24.0f);
        document.add(articl9);

        for (int i = 10; i<=count; i++) {
            Paragraph para9_1 = new Paragraph(PARAGRAF_9_1, fontNormal11);
            para9_1.setAlignment(Element.ALIGN_LEFT);
            para9_1.setLeading(24.0f);
            document.add(para9_1);
        }
        Paragraph articl10 = new Paragraph(ARTICLE_10, fontBold11);
        articl10.setAlignment(Element.ALIGN_CENTER);
        articl10.setLeading(24.0f);
        document.add(articl10);
        Paragraph para10_1 = new Paragraph(PARAGRAF_10_1, fontNormal11);
        para10_1.setAlignment(Element.ALIGN_LEFT);
        para10_1.setLeading(24.0f);
        document.add(para10_1);
        document.close();
        writer.close();
        stream.close();
    }
    final static String PARAGRAF_0="\n";
    //Title list
    final static String PARAGRAF_1 ="УТВЕРЖДЕН        \n";
    final static String PARAGRAF_2 ="постановлением администрации\n" +
            "городского округа город Выкса\n" +
            "от 02.09.2014 года № 3781         \n\n\n\n\n\n\n\n\n\n\n\n\n";
    final static String PARAGRAF_3 ="УСТАВ\n\n";
    final static String PARAGRAF_4 ="МУНИЦИПАЛЬНОГО УНИТАРНОГО ПРЕДПРИЯТИЯ\n" +
            "ГОРОДСКОГО ОКРУГА ГОРОД ВЫКСА\n";
    final static String PARAGRAF_5 ="\"МОЙКИ\"\n";
    final static String PARAGRAF_6 ="\n(в новой редакции)\n";
    final static String PARAGRAF_7 ="г. ВЫКСА\n"+
                                    "2014 г.";
    final static String ARTICLE_1 = "1. Общие положения\n";
    final static String PARAGRAF_1_1 = "         1.1.  Муниципальное предприятие \"МОИКИ\" (далее\n" +
            "именуемое \"Предприятие\") создано в соответствии с распоряжением главы\n" +
            "администрации Выксунского района от 09.07.2001 г. № 884-р «О создании\n" +
            "муниципального унитарного предприятия \"МОЙКИ\". Гражданским кодексом\n"+
            "Российской Федерации.\n" +
            "          1.2.  Предприятие является самостоятельным хозяйствующим субъектом,\n" +
            "коммерческой организацией, имущество которого находится в собственности\n" +
            "городского округа города Выкса Нижегородской области, закрепленного за\n" +
            "Предприятием на праве хозяйственного ведения.\n" +
            "          1.3.  Предприятие создается без ограничения срока.\n" +
            "          1.4.  Учредителем Предприятия является муниципальное образование\n" +
            "городской округ город Выкса Нижегородской области.\n" +
            "        1.5.  Функции и полномочия учредителя осуществляет администрация\n" +
            "городского округа город Выкса Нижегородской области.\n" +
            "        1.5.1.  В своей деятельности Предприятие руководстауется настоящим\n" +
            "Уставом и действующим законолательством.\n" +
            "       - Изменения в Устав Предприятия вносятся по решению\n" +
            "администрации городского округа города Выкса Нижегородской области\n" +
            "       - Изменения, внесенные в Устав Предприятия или Устав в новой\n" +
            "редакции приобретают силу для третьих ляц с момента их\n" +
            "государсвенной регистрации, а в случаях установленных\n" +
            "законодательством с момента уведомления органа, осуществляющего\n" +
            "государствснную регистрацию юридических лиц.\n" +
            "        1.6.  Полное фирменное наименование Предприятиея:\n" +
            "Муниципальное унитарное предприятие городского округа город Выкса\n" +
            "\"МОЙКИ\"\n" +
            "Сокращенное наименование предприятия: МУП \"МОЙКИ\"\n"+
            "        1.7.  Предприятие являестся юридическим лицом со дня государственной\n" +
            "регистрации, имеет круглую печать, бланки и штампы со своим\n" +
            "наименованием, расчетный и иные счета в банковских учреждениях.\n" +
            "        1.8.  Предариятие может иметь свой товарный знак (знак обслуживания).\n" +
            "        1.9.  Предариятие имеет самостоятельный баланс и обособленное\n" +
            "имущество, которое закреплено за ним на праве хозяйственного ведения.\n" +
            "        1.10.  Предприятие отвечает по своим обязательствам всем\n" +
            "принадлежащим ему имуществом, на которое согласно действующему\n" +
            "законодательству может быть наложено взыскание.\n" +
            "Предприятие не отвечает пo обязательствам Учредителя. Учредитель не несет\n" +
            "ответсвенность по обязательствам Предприятия.\n" +
            "        1.11.  Предприятие от своего имени приобретает имуществевные и личные\n" +
            "неимущественные права, несет обязамость, выступает истцом, ответчиком и\n" +
            "третьим лицом в суде и арбитражном суде в соответствии с дсйствуюшим\n" +
            "законодательством.\n" +
            "        1.12.1.  Место нахождения Предприятия:\n" +
            "Юредический адрес: Нижегородская обл., город Выкса, р.п. Рыбачее,\n" +
            "Проммикрорайон № 1, здание № 2.\n" +
            "        1.12.2.  Почтовые адрес: 123456, Нижегородская обл., город Выкса p.п.\n" +
            "Рыбачее. Проммикрорайон № 1. здание № 2.\n" +
            "        1.13.  Предприятие по согласованию с собственником имущества может\n" +
            "создавать филиалы и открвать представительства.\n" +
            "        1.14.  Филиалом Предприятия является его обособленное подразделение,\n" +
            "расположенное вне места нахождения Предприятия и осуществляющее все его\n" +
            "функции или их часть, в том числе функцию представительства.\n" +
            "        1.15.  Представительством Предприятия является его обособленное\n" +
            "подразделение, расположенное вне места нахождения Предприятия,\n" +
            "представляющее интересы Предприятия и осуществляющие их защиту.\n";
    final static String ARTICLE_2 = "2. Цель и виды деятельности Предприятия\n";
    final static String PARAGRAF_2_1="        2.1.   Общество создается для осуществления коммерческой деятельности в целях извлечения прибыли в" +
            "качестве основной цели своей деятельности.\n" +
            "        2.2. Для реализации поставленных целей Общество осуществляет любые виды деятельности, не запрещенные" +
            "действующим законодательством Российской Федерации, включая, но не ограничиваясь:" +
            "Деятельность агентов по оптовой торговле живыми животными, сельскохозяйственным сырьем," +
            "текстильным сырьем и полуфабрикатами.\n" +
            "Деятельность агентов по оптовой торговле топливом, рудами, металлами и химическими" +
            "веществами" +
            "Деятельность агентов по оптовой торговле лесоматериалами и строительными материалами\n\n ";
    final static String ARTICLE_3 = "3. Имущество Предприятия\n";
    final static String PARAGRAF_3_1="        3.1. Имущество Общества образуется за счет вкладов в уставный капитал, а также за счет иных источников," +
            "предусмотренных действующим законодательством Российской Федерации. В частности, источниками" +
            "образования имущества Общества являются:" +
            "\n      -уставный капитал Общества;" +
            "\n      -доходы, получаемые Обществом в результате ведения хозяйственной деятельности;" +
            "\n      -кредиты банков и других кредиторов;" +
            "\n      -вклады участников;" +
            "\n      -иные источники, не запрещенные законодательством Российской Федерации.\n" +
            "        3.2. Имущество, переданное участником Общества в пользование Обществу для оплаты своей доли, в случае" +
            "выхода или исключения такого участника из Общества остается в пользовании Общества в течение" +
            "срока, на который данное имущество было передано, если иное не предусмотрено договором об" +
            "учреждении Общества.\n" +
            "        3.3. Общество может создавать резервный фонд и иные фонды в порядке и в размерах, которые должны быть" +
            "установлены Уставом.\n" +
            "        3.4. Общество может объединить часть своего имущества с имуществом иных юридических лиц для" +
            "совместного производства товаров, выполнения работ и оказания услуг, а также в иных целях, не" +
            "запрещенных законом.\n" +
            "        3.5. Общество вправе ежеквартально, раз в полгода, раз в девять месяцев, или раз в год принимать решение о" +
            "распределении своей чистой прибыли между участниками Общества. Решение об определении части" +
            "прибыли Общества, распределяемой между участниками Общества, принимается Общим собранием" +
            "участников Общества." +
            "Часть прибыли Общества, предназначенная для распределения между его участниками, распределяется" +
            "пропорционально их долям в уставном капитале Общества.\n" +
            "        3.6. Общество не вправе принимать решение о распределении своей прибыли между участниками Общества:" +
            "\uF0B7 до полной оплаты всего уставного капитала Общества;" +
            "\uF0B7 до выплаты действительной стоимости доли или части доли участника Общества в случаях," +
            "предусмотренных действующим законодательством РФ;" +
            "\uF0B7 если на момент принятия такого решения Общество отвечает признакам несостоятельности" +
            "(банкротства) в соответствии с федеральным законом о несостоятельности (банкротстве) или если" +
            "указанные признаки появятся у Общества в результате принятия такого решения;" +
            "\uF0B7 если на момент принятия такого решения стоимость чистых активов Общества меньше его" +
            "уставного капитала и резервного фонда (в случае, если резервный фонд образован) или станет" +
            "меньше их размера в результате принятия такого решения;" +
            "\uF0B7 в иных случаях, предусмотренных федеральными законами.\n" +
            "        3.7. Общество не вправе выплачивать участникам Общества прибыль, решение о распределении которой" +
            "между участниками Общества принято:" +
            "\uF0B7 если на момент выплаты Общество отвечает признакам несостоятельности (банкротства) в" +
            "соответствии с федеральным законом о несостоятельности (банкротстве) или если указанные\n" +
            "признаки появятся у Общества в результате выплаты;" +
            "\uF0B7 если на момент выплаты стоимость чистых активов Общества меньше его уставного капитала и" +
            "резервного фонда (в случае, если резервный фонд образован) или станет меньше их размера в" +
            "результате выплаты;" +
            "\uF0B7 в иных случаях, предусмотренных действующим законодательством РФ.\n\n ";
    final static String ARTICLE_4 = "4. Права собственника имущества Предприятия\n";
    final static String PARAGRAF_4_1="        4.1.  Участвовать в управлении делами Общества, в том числе путем участия в Общих собраниях участников," +
            "лично либо через своего представителя.\n" +
            "        4.2. Получать информацию о деятельности Общества и знакомиться с его бухгалтерскими книгами и иной" +
            "документацией.\n" +
            "        4.3. Принимать участие в распределении прибыли.\n" +
            "        4.4. Избирать и быть избранным в органы управления и контрольные органы Общества.\n" +
            "        4.5. Знакомиться с протоколами Общего собрания и делать выписки из них.\n" +
            "        4.6. Получать в случае ликвидации Общества часть имущества, оставшегося после расчетов с кредиторами," +
            "или его стоимость.\n" +
            "        4.7. Обжаловать в соответствующие органы Общества действия (бездействия) должностных лиц Общества.\n" +
            "        4.8. Вносить предложения по повестке дня, отнесенные к компетенции Общего собрания участников.\n" +
            "        4.9. Выйти из Общества путем отчуждения доли Обществу независимо от согласия других его участников" +
            "или Общества с выплатой ему действительной стоимости его доли или выдачей ему в натуре имущества" +
            "такой же стоимости с согласия этого участника Общества.\n" +
            "        4.10. Требовать, действуя от имени Общества, возмещения причиненных Обществу убытков.\n" +
            "        4.11. Оспаривать, действуя от имени Общества, совершенные им сделки по основаниям, предусмотренным" +
            "статьей 174 Гражданского кодекса Российской Федерации, и требовать применения последствий их" +
            "недействительности, а также применения последствий недействительности ничтожных сделок Общества.\n" +
            "        4.12. Требовать исключения другого участника из Общества в судебном порядке с выплатой ему" +
            "действительной стоимости его доли участия, если такой участник своими действиями (бездействием)" +
            "причинил существенный вред Обществу либо иным образом существенно затрудняет его деятельность и" +
            "достижение целей, ради которых оно создавалось, в том числе грубо нарушая свои обязанности," +
            "предусмотренные законом или настоящим Уставом.\n" +
            "        4.13. Участник Общества, требующий возмещения причиненных Обществу убытков либо признания сделки" +
            "Общества недействительной или применения последствий недействительности сделки, должен принять" +
            "разумные меры по заблаговременному уведомлению других участников Общества и в соответствующих" +
            "случаях Общества о намерении обратиться с такими требованиями в суд, а также предоставить им иную" +
            "информацию, имеющую отношение к делу, через Общество.\n" +
            "        4.14. Пользоваться дополнительными правами, которые могут быть предусмотрены Уставом Общества при" +
            "его учреждении или предоставлены участнику (участникам) Общества по решению Общего собрания" +
            "участников Общества.\n\n";
    final static String ARTICLE_5 = "5. Права и обязанности Предприятия\n";
    final static String PARAGRAF_5_1="        5.1. Предлршпие имеет право:\n" +
            "        5.1.1. Планировать и осуществлять свою деятельность, исходя из\n" +
            "уставных целей, утвержденных в установленном, порядке плановых\n" +
            "докуметов, служащих достижению цели, указанных в пункте 2.1. Устава. в\n" +
            "пределах видов деятельности, предусмотренных уставом.\n" +
            "        5.1.2. Совершать различные виды сделок, не противоречащих Уставу, не\n" +
            "запрещенных законодательством и направленных нa достнжение уставных\n" +
            "целей, выполнение требований плановых документов, отраслевых и\n" +
            "экономических заданий.\n" +
            "        5.1.3. Реализовывать свою продукцюо и товары, выполять работы и\n" +
            "предоставлять услуги по ценанам и тарифам установленным самостоятельно\n" +
            "или на основе заключенных договоров, а в случаях, предусмотренным\n" +
            "законодательством, - по государственным расценкам.\n" +
            "        5.1.4. Создавать обособленные подразделения, необходимых для\n" +
            "достижения уставных целей в соответсвии с требованиями законодательства.\n" +
            "        5.1.5. Передавать в залог, сдавать в аренду или вносить имущество в виде\n" +
            "вклада в уставной (складочный) капитал хозяйственных обществ и\n" +
            "товариществ, а также некоммерческих организаций с получением в\n" +
            "необходимых случаях согласия Собственника. " +
            "\n        5.1.6. Вступать в ассоциации, союзы в целях развития и совершенствования основной деятельности, с согласия собственника, если законодательством Российской Федерации не предусмотрено иное." +
            "\n        5.1.7. Определять и устанавливать формы, нормы и системы оплаты труда, численность работников, структуру и штатное расписание в соответствии с законодательством, Уставом и согласованными в установленном порядке плановыми документами Предприятия. " +
            "\n        5.1.8. Осуществлять другие права, не противоречащие законодательству, целям и видам деятельности Предприятия. " +
            "\n        5.2. Предприятие обязано: " +
            "\n        5.2.1. Выполнять утвержденные в установленном порядке основные экономические показатели деятельности Предприятия; " +
            "\n        5.2.2. Возмещать ущерб, причиненный нерациональным использованием: земли и других природных ресурсов, загрязнением окружающей среды, нарушением правил безопасности производства, санитарно-гигиенических норм и требований по защите здоровья работников, населения и потребителе?: продукции и др.; " +
            "\n        5.2.3. Обеспечивать своевременно и в полном объеме выплату работникам заработной платы и иных выплат в соответствии с действующим законодательством Российской Федерации; " +
            "\n        5.2.4. Обеспечивать своим работникам безопасные условия труда; " +
            "\n        5.2.5. Ежегодно перечислять в бюджет городского округа часть прибыли, остающиеся в его распоряжении после уплаты налогов и иных обязательных платежей в размерах и в сроки, которые определяются органами местного самоуправления; " +
            "\n        5.2.6. Обеспечивать гарантированные условия труда и меры социальной защиты своих работников; " +
            "\n        5.2.7. Осуществлять оперативный и бухгалтерский учет результатов финансово-хозяйственной и иной деятельности, вести статистическую отчетность, отчитываться о результатах деятельности и использовании имущества с предоставлением отчетов в порядке и сроки, установленные законодательством Российской Федерации; " +
            "\n        5.2.8. Предоставлять государственным органам информацию в случаях и порядке, предусмотренных законодательством Российской Федерации. " +
            "\n        5.2.9. Выполнять другие обязанности в соответствии с законодательством.\n\n";
    final static String ARTICLE_6 = "6. Крупная сделка\n";
    final static String PARAGRAF_6_1="        6.1 Очень крупная сделка.\n";
    final static String ARTICLE_7 = "7. Управление Предприятием\n";
    final static String PARAGRAF_7_1="        7.1 Тут расписано как управлять.";
    final static String ARTICLE_8 = "8. Труд и социальная защита\n";
    final static String PARAGRAF_8_1="        8.1 Трудись и социально защищайся.\n\n";
    final static String ARTICLE_9 = "9. Хранение документов Предприятия\n\n";
    final static String PARAGRAF_9_1="Общество обязано хранить следующие документы:" +
            "\n        -договор об учреждении Общества, решение об учреждении Общества, устав Общества, а также" +
            "внесенные в устав Общества и зарегистрированные в установленном порядке изменения;" +
            "\n        -протокол (протоколы) собрания учредителей (участников) Общества, \nсодержащий решение о" +
            "создании Общества и об утверждении денежной оценки\n неденежных вкладов в уставный капитал" +
            "Общества, а также иные решения, связанные с созданием Общества;" +
            "\n        -документ, подтверждающий государственную регистрацию Общества;" +
            "\n        -документы, подтверждающие права Общества на имущество, находящееся на его балансе;" +
            "\n       -внутренние документы Общества;" +
            "\n        -положения о филиалах и представительствах Общества;" +
            "\n        -документы, связанные с эмиссией облигаций и иных эмиссионных ценных бумаг Общества;" +
            "\n        -протоколы общих собраний участников Общества;" +
            "\n        -списки аффилированных лиц Общества;" +
            "\n        -заключения аудитора, государственных и муниципальных органов финансового контроля;" +
            "\n        -иные документы, предусмотренные федеральными законами и иными правовыми актами" +
            "Российской Федерации, уставом Общества, внутренними документами Общества, решениями" +
            "общего собрания участников Общества, и исполнительных органов Общества." +
            "\n        -документов не хватает для целой страницы пришлось добавить;" +
            "\n        -мой документ для красивой записи;" +
            "\n        -мой документ2 для красивой записи;" +
            "\n        -мой документ3 для красивой записи;" +
            "\n        -мой документ4 для красивой записи;" +
            "\n        -а то некрасиво печататься будет;" +
            "\n        -теперь все хорошо.\n\n";
    final static String ARTICLE_10 = "10. Реорганизация и ликвидация предприятия\n";
    final static String PARAGRAF_10_1="        10.1 В соответсвии с законодательством РФ.";


}