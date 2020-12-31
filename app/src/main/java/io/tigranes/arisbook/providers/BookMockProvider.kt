package io.tigranes.arisbook.providers

import io.tigranes.arisbook.model.BesedaCardProtocolTemplate
import io.tigranes.arisbook.repositories.BookRepository
import javax.inject.Inject

class BookMockProvider @Inject constructor(): BookRepository {

    override fun getAllBesedas(): List<BesedaCardProtocolTemplate> {
        return listOf(
            BesedaCardProtocolTemplate(
                besedaTitle = "В ДРЕВНЕМ КОТЛЕ",
                besedaNumber = "БЕСЕДА ПЕРВАЯ",
                besedaCoverImageSource = "https://static.wixstatic.com/media/42d421_2bd296e843e540e6be4f744ee20b06ac~mv2_d_2048_1371_s_2.jpg",
                description = "Формирование и развитие армянской идентичности протекало в границах региона, известного под названием " +
                        "«Армянское нагорье». Это географическое обозначение появилось в третьей четверти XIX в."),

        BesedaCardProtocolTemplate(
            besedaTitle = "ВОСХОЖДЕНИЕ",
            besedaNumber = "БЕСЕДА ВТОРАЯ",
            besedaCoverImageSource = "https://www.ancient.eu/img/r/p/500x600/8077.jpg",
            description = "С середины IX в. до н. э. на арену региональной военно-политической жизни выступило молодое амбициозное " +
                    "государство, известное из ассирийских источников под названием «Урарту». Научное сообщество не оспаривает " +
                    "воззрения о том, что термин – одна из вариаций семитских прочтений понятия «Арарат»."),

        BesedaCardProtocolTemplate(
            besedaTitle = "О СКОЛЬЗКИХ ВЕРШИНАХ ВЫСОКОЙ ПОЛИТИКИ",
            besedaNumber = "БЕСЕДА ТРЕТЬЯ",
            besedaCoverImageSource = "https://lh3.googleusercontent.com/proxy/q1Inng1dv_GgtSz5k-1OJiQIKg9J-hJG-jrGDF2ZOPZLpIVkdYvdwAuLeCWw2GZT0pFFm5iIgAIrRKhMg7cJKPDtobecmkGdqfFtcEJhTYHXhrDV0kMlWt82QRCwHnjV8xTbv1x2v-FwOZ8",
            description = "В I в. до н. э. Великая Армения превратилась в сильнейшую и крупнейшую по занимаемой площади монархию " +
                    "Передней Азии, в орбите политического влияния которой находились земли от Синайского полуострова до Кав" +
                    "казских гор."),
            BesedaCardProtocolTemplate(
                besedaTitle = "О ПРОВОЗГЛАШЕНИИ ХРИСТИАНСТВА ГОСУДАРСТВЕННОЙ РЕЛИГИЕЙ",
                besedaNumber = "БЕСЕДА ЧЕТВЕРТАЯ",
                besedaCoverImageSource = "https://www.nationalgeographic.com/content/dam/travel/Guide-Pages/asia/armenia_h_00000220066588.ngsversion.1501784794813.adapt.1900.1.jpg",
                description = "С двадцатых годов III в. в Иране (Эраншахр, Ераншахр) воцарилась правящая семья Сасанидов. В какой мере " +
                        "это событие затронуло Великую Армению?"),
            BesedaCardProtocolTemplate(
                besedaTitle = "ЧЕРЕЗ ТЕРНИИ",
                besedaNumber = "БЕСЕДА ПЯТАЯ",
                besedaCoverImageSource = "https://cdn.araratour.com/file_manager/files/The%20Sights%20of%20Armenia/%D0%9Conasteries%20and%20Temples/AC3_griqor89.jpeg",
                description = "В середине IV в. в ряде городов существовали свои сильные богословские школы и традиции. Велись диспуты, " +
                        "заметно расширилась география миссионерства. Обращались ли авторы позднего эллинизма к Армении, именно " +
                        "как к местности, где Бог решил бросить якорь Ноя? В круговороте стремительно развивающихся событий сохра" +
                        "нила ли Араратская страна реноме одной из наиболее почитаемых земель?"),
            BesedaCardProtocolTemplate(
                besedaTitle = "О ПЕРЕКРОЙКЕ ПРЕДЕЛОВ И ПРИДЕЛОВ",
                besedaNumber = "БЕСЕДА ШЕСТАЯ",
                besedaCoverImageSource = "https://www.iarmenia.org/wp-content/uploads/2017/08/GEGHARD-MONASTERY-M.jpg",
                description = "В октябре 451 г. (спустя пять месяцев после Аварайрской битвы и в период ожесточенного отстаивания армя" +
                        "нами христианства в борьбе с незатухающей военно-религиозной агрессией Сасанидов) в константинопольском " +
                        "предместье Халкидон начал работу Четвертый Вселенский собор, известный как Халкидонский. Армянская Апос" +
                        "тольская Церковь не принимала участия в заседаниях форума и отвергла принятые на нем постановления."),
            BesedaCardProtocolTemplate(
                besedaTitle = "О ЗАКАТЕ ПЕРСИДСКОГО СОЛНЦА И ВОСХОДЕ АРАБСКОЙ ЛУНЫ",
                besedaNumber = "БЕСЕДА СЕДЬМАЯ",
                besedaCoverImageSource = "https://storyiq.co.nz/wp-content/uploads/2019/05/Arabain-night.jpg",
                description = "Со второй четверти VII в. начался новый этап в истории народов. Становление ислама и последующее обра" +
                        "зование обширного Арабского халифата расширили географию военных столкновений и усугубили культурные " +
                        "противостояния."),
            BesedaCardProtocolTemplate(
                besedaTitle = "ОБ ЭПОХЕ АНИЙСКОГО ЦАРСТВА",
                besedaNumber = "БЕСЕДА ВОСЬМАЯ",
                besedaCoverImageSource = "https://www.nationalgeographic.com/content/dam/archaeologyandhistory/rights-exempt/history-magazine/2020/03-04/churches-ani/church-st-gregory-landscape.adapt.1900.1.jpg",
                description = "В IX в. армянский народ восстановил политическую независимость на большей части исторической родины. " +
                        "Новый престол фигурирует в научной литературе как Анийское царство (по названию столицы), или Царство Баг" +
                        "ратуни (по фамилии властвующего дома)."),
            // Add images
            BesedaCardProtocolTemplate(
                besedaTitle = "О ПОЛИТИЧЕСКОЙ СИТУАЦИИ В XI–XIII вв.",
                besedaNumber = "БЕСЕДА ДЕВЯТАЯ",
                besedaCoverImageSource = "https://irent.am/storage/posts/July2019/sqgOX9nV8PLwbCQbkFyT.jpg",
                description = "Какой представлялась вторая половина XI в. в армянском преломлении?"),
            BesedaCardProtocolTemplate(
                besedaTitle = "О КУЛЬТУРНОЙ НЕСОВМЕСТИМОСТИ",
                besedaNumber = "БЕСЕДА ОДИННАДЦАТАЯ",
                besedaCoverImageSource = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsJu5hECIviqlJOkkhxiBrnhwjQJEOcldelA&usqp=CAU",
                description = "Рубеж XV–XVI вв. отобразился на политической карте Передней Азии беспрецедентным в ракурсе предшест" +
                        "вующих двенадцати столетий новшеством – полнейшим отсутствием в регионе христианского трона."),
            BesedaCardProtocolTemplate(
                besedaTitle = "МЕЖДУ РЕВОЛЮЦИЕЙ И ЭВОЛЮЦИЕЙ",
                besedaNumber = "БЕСЕДА ДВЕНАДЦАТАЯ",
                besedaCoverImageSource = "https://whc.unesco.org/uploads/thumbs/site_1011_0016-1200-630-20130715105638.jpg",
                description = "Начало XVIII в. совпало с несколькими событиями, оказавшими прямое и побочное воздействие на философию " +
                        "региональных процессов."),
            BesedaCardProtocolTemplate(
                besedaTitle = "ВОСТОЧНАЯ АРМЕНИЯ В СОСТАВЕ РОССИЙСКОЙ ИМПЕРИИ",
                besedaNumber = "БЕСЕДА ТРИНАДЦАТАЯ",
                besedaCoverImageSource = "https://d31qtdfy11mjj9.cloudfront.net/gallery/1566216593498822616.jpg",
                description = "Середина девяностых годов XVIII в. внесла коррективы в наметившиеся тенденции."),
            BesedaCardProtocolTemplate(
                besedaTitle = "В ТИСКАХ РАДИКАЛЬНЫХ ИДЕОЛОГИЙ",
                besedaNumber = "БЕСЕДА ЧЕТЫРНАДЦАТАЯ",
                besedaCoverImageSource = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTiJDkYTEmCDNqs8_PsYyVOn_uqrwa3S5-Rag&usqp=CAU",
                description = "Итак, новая Восточная война, известная под названием Крымской (1853–1856 гг.), заморозила большинство " +
                        "гражданских программ в регионе."),
            BesedaCardProtocolTemplate(
                besedaTitle = "МЕЖДУ ПАНИСЛАМИСТСКИМ МОЛОТОМ И ЧЕРНОСОТЕННОЙ НАКОВАЛЬНЕЙ",
                besedaNumber = "БЕСЕДА ПЯТНАДЦАТАЯ",
                besedaCoverImageSource = "https://foreignpolicy.com/wp-content/uploads/2019/04/gettyimages-1062372836.jpg?w=1500",
                description = "В горниле русско-турецкого противостояния и последовавших территориальных потерь, а также с учетом " +
                        "претензий европейских держав на усиление собственных позиций в Передней Азии Абдул Гамид II возвел пан" +
                        "исламизм в категорию государственной политики. Тем самым преследовалась цель создания масштабного дви" +
                        "жения против христианской экспансии с участием всех единоверцев, независимо от родословия."),
            BesedaCardProtocolTemplate(
                besedaTitle = "ГЕНОЦИД",
                besedaNumber = "БЕСЕДА ШЕСТНАДЦАТАЯ",
                besedaCoverImageSource = "https://static1.squarespace.com/static/54412118e4b03de3b6796773/553e648fe4b04b98ae434994/5ae1a6f288251b3e984b2190/1527318003871/%D0%A4%D0%9E%D0%A2%D0%9E.jpg?format=1500w",
                description = "С 1906–1907 гг. волна армянских притеснений стала постепенно затухать. Чем обуславливались инверсии?"),
            BesedaCardProtocolTemplate(
                besedaTitle = "О ПЕРВЫХ ЗАКАВКАЗСКИХ РЕСПУБЛИКАХ",
                besedaNumber = "БЕСЕДА СЕМНАДЦАТАЯ",
                besedaCoverImageSource = "https://lh3.googleusercontent.com/proxy/fO9AqZ4X7ggl-464JY0YTq9iPLp7E57mjOKuBatcNvBkwj_2v3nGuK2wFVlCJSXzyZLFb3S0EPvjG3YC77YihJtJ6XyjSBBI8Zu1liUpFBCgrOyPPL_9mReDLxSq-ABfUcA2_g",
                description = "По положению на январь 1916 г., приблизитель" +
                        "ная численность умерщвленных, депортированных и исламизированных составила в Себастии – 81 000, Эрзу" +
                        "руме – 72 000, Никодимии – 65 000, Диярбакыре – 55 100, Битлисе и Муше – 51 500, Харберде – 45 000, Кесарии " +
                        "– 40 000, Трапезунде – 32 700, Сисе и Аджине – 30 300, Зейтуне и Фонузе – 28 000, Шапин-Гарагисаре – 25 300, " +
                        "Амасии – 25 000, Сгерте – 25 000, Ерзнка – 25 000, Евдокии – 23 000."),
            BesedaCardProtocolTemplate(
                besedaTitle = "РОЗОВАЯ МОЛЕКУЛА",
                besedaNumber = "БЕСЕДА ВОСЕМНАДЦАТАЯ",
                besedaCoverImageSource = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTkRRtHnWcxBl9gGjTnL61UqG9Ah9kUCea-g&usqp=CAU",
                description = "Осенью 1918 г. британцы вошли в регион. Мировая война завершалась поражением Четверного союза и крахом " +
                        "сразу трех империй – Германской, Австро-Венгерской и Османской. 29 сентября Антанта приняла капитуляцию " +
                        "Болгарского царства, 30 октября – Османской империи (Мудросское перемирие), 3 ноября – Австро-Венгрии " +
                        "(Падуйское перемирие), 11"),
            BesedaCardProtocolTemplate(
                besedaTitle = "ВОСТОЧНАЯ ЭКСПРЕССИЯ",
                besedaNumber = "БЕСЕДА ДЕВЯТНАДЦАТАЯ",
                besedaCoverImageSource = "https://static1.squarespace.com/static/54412118e4b03de3b6796773/553e648fe4b04b98ae434994/58c8e7b8bebafbba1ac3399e/1544793440408/%D0%9E%D0%B1%D0%BB%D0%BE%D0%B6%D0%BA%D0%B0.JPG?format=1500w",
                description = "После подписания Севрского договора большевистская Россия, ангорская Турция и советский Азербайджан " +
                        "объявили войну Армении. Ангорское правительство не признало Севрский договор."),
            BesedaCardProtocolTemplate(
                besedaTitle = "О ДРЕВНИХ И НОВЫХ НАЦИЯХ",
                besedaNumber = "БЕСЕДА ДВАДЦАТАЯ",
                besedaCoverImageSource = "https://i.pinimg.com/originals/1b/26/84/1b26840a2d64f2ce9bcc89a7d78c08be.jpg",
                description = "Начало двадцатых годов – очередной жребий в летописи армянского народа. Западные земли, занимавшие не " +
                        "менее 70% исторической родины, лишились своего автохтонного хозяйственника и стали особенно интенсивно " +
                        "обживаться курдами."),
            BesedaCardProtocolTemplate(
                besedaTitle = "МЕЖДУ ИДЕЕЙ И ИДЕОЛОГИЯМИ",
                besedaNumber = "БЕСЕДА ДВАДЦАТЬ ПЕРВАЯ",
                besedaCoverImageSource = "https://i.pinimg.com/736x/2f/97/4e/2f974ee237f10ba7e76248c17b994b7e.jpg",
                description = "Вернемся к вопросу национальной идеологии. Если ее рассматривать в качестве подпитывающей армянскую " +
                        "национальную Идею комплексной программы реализации сообщающихся проектов развития (военных, экономи" +
                        "ческих, дипломатических, научных, культурных, социальных, здравоохранительных, образовательных, спортив" +
                        "ных), то становится очевидным необходимость существования политически независимого пространства вопло" +
                        "щения программы."),
            BesedaCardProtocolTemplate(
                besedaTitle = "АРМЯНСКИЕ ГРАНИ ВТОРОЙ МИРОВОЙ ВОЙНЫ",
                besedaNumber = "БЕСЕДА ДВАДЦАТЬ ВТОРАЯ",
                besedaCoverImageSource = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/1a/4e/61/74/monasteries-in-armenia.jpg?w=500&h=300&s=1",
                description = "В сентябре 1939 г. началась Вторая мировая война, продлившаяся шесть лет. При определенных сценариях – " +
                        "например, совместном германо-турецком вторжении в СССР, или позднейшем активном подключении Анкары к " +
                        "войне на стороне Берлина – она могла покончить с армянским присутствием на Восточной части исторической " +
                        "родины в границах Советского Закавказья."),
            BesedaCardProtocolTemplate(
                besedaTitle = "О НЕКОТОРЫХ БЕСПОРЯДКАХ ПРИ ПОТСДАМСКОМ МИРОПОРЯДКЕ",
                besedaNumber = "БЕСЕДА ДВАДЦАТЬ ТРЕТЬЯ",
                besedaCoverImageSource = "https://barevarmenia.com/modules/armsights/images/13490358180.jpg",
                description = "7 мая 1945 г. во французском Реймсе представителями Верховного командования вермахта – с одной стороны, " +
                        "и Верховного командования Западных союзников и СССР – с другой, был подписан Акт о безоговорочной капиту" +
                        "ляции германских вооруженных сил."),
            BesedaCardProtocolTemplate(
                besedaTitle = "В КАЧЕСТВЕ ЗАКЛЮЧЕНИЯ, ИЛИ ПРО РАЗНЫЕ ЧУДЕСА",
                besedaNumber = "БЕСЕДА ДВАДЦАТЬ ЧЕТВЕРТАЯ",
                besedaCoverImageSource = "https://mir-s3-cdn-cf.behance.net/project_modules/disp/ae383415104891.562f2971156e8.jpg",
                description = "БЕСЕДА ДВАДЦАТЬ ЧЕТВЕРТАЯ Итак, в самом начале девяностых годов образовались две формы армянской государственности – РА и НКР."),
        )
    }
}