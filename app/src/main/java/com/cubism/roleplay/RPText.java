package com.cubism.roleplay;

import java.util.HashMap;

public class RPText {
    static HashMap<Integer, String> greeting = new HashMap<>();
    static HashMap<Integer, String> names = new HashMap<>();
    static HashMap<Integer, String> characters = new HashMap<>();
    static HashMap<Integer, String> places = new HashMap<>();
    static HashMap<Integer, String> about = new HashMap<>();
    static HashMap<Integer, String> aboutLoc = new HashMap<>();

    public static void main() {
        greeting.put(1,"Добро пожаловать, ");
        greeting.put(2,"Рады вам, ");
        greeting.put(3,"Очень рады вас видеть, ");
        greeting.put(4,"Рады вас приветствовать, ");
        greeting.put(5,"Моё почтение, ");

        names.put(1,"Джон Картер");
        names.put(2,"Джордж Томас");
        names.put(3,"Александр Иванов");
        names.put(4,"Уильем Афтон");
        names.put(5,"Майкл Шмидт");
        names.put(6,"Дмитрий Антонов");
        names.put(7,"Джонс Смит");

        characters.put(1,"умный");
        characters.put(2,"тупой");
        characters.put(3,"смешленной");
        characters.put(4,"стратегичен");
        characters.put(5,"начитанный");
        characters.put(6,"низкого роста");
        characters.put(7,"среднего роста");
        characters.put(8,"высокого роста");
        characters.put(9,"сильного телесложения");
        characters.put(10,"слабого телесложения");
        characters.put(11,"среднего телесложения");
        characters.put(12,"красивой");
        characters.put(13,"привлекательной");
        characters.put(14,"уродской");
        characters.put(15,"не выделяющийся");



        places.put(1,"лес");
        places.put(2,"город");
        places.put(3,"порт");
        places.put(4,"горы");
        places.put(5,"остров");
        places.put(6,"лес орков");
        places.put(7,"стоянка пауков");
        places.put(8,"город искателей");
        places.put(9,"гора мертвецов");
        places.put(10,"пустошь");
        places.put(11,"железный лес");
        places.put(12,"город иновации");
        places.put(13,"электростанция будущего");
        places.put(14,"улица города");
        places.put(15,"ценрт");

        aboutLoc.put(1,"место подходшие не каждому для всех, но умеющие зацепить своеобразной красотой. Торговцы много говорят об этом месте. ");
        aboutLoc.put(2,"для некоторых это место вызывает ностальгию, для других печаль. Место с своей историей. Никогда не знаешь, что готовит в этот раз. ");
        aboutLoc.put(3,"покажется на первый взгляд скучной и однообразной местностью, но стоит здесь побивать немного дольше и уйти уже не захочешь. ");

        about.put(1,"перед вами лесной бор, Вы пришли в бор из равнины, которая позади Вас, в лесу огромные сосны и впереди виднеется маленькая деревушка...");
        about.put(2,"город называет \"Долина механиков и поваров\", за каждым углом мастерская или кондитерская, у каждого жителя есть работа, город красивый, Вас это устроило");
        about.put(3,"перед вами бескрайний океан, вы видите корабли разных масштабов и размеров, в локации главный Джек, капитан Джек");
        about.put(4,"вас окружает снег и красивый вид, в этих горах расположена деревня местных шахтеров");
        about.put(5,"вокруг Вас тихий, спокойный океан , на острове кроме песка и пальм нечего нет, на пальмах растут бананы");
        about.put(6,"место где обитают и развиваются орки, рядом с лесом расположен лагерь оркв , с давних лет орки оккупировали этот лес...");
        about.put(7,"эта дорожка ведет короткий путь в город, пустая равнина, где часто останавливаются пауки, никто  не знает когда они там остановятся, а когда уйдут...");
        about.put(8,"это маленький город созданный для начинающих искателей, город находится под контролем Гильдии искателей");
        about.put(9,"эта гора вызов для искателей в прямом смысле этого слова, на гору может залесть лишь сильнейшие, гора окружена острыми как лезвие скалами, многие шли на это испытание...");
        about.put(10,"эта мертвое место со стервятниками, однако это единственный путь в столицу, крому песка и сухих деревьев нечего нет...");
        about.put(11,"этот лес состоящий из железных деревьев и мертвой земли, это место было полигоном для ученых первое время");
        about.put(12,"Ваше место нахождение город... Если сравнить реальность из вне города и как себя ощущаешь, разница как небо и земля, куда не посмотри есть магазин, все счастлливо работают это как утопия , но здесь явно что-то не так......");
        about.put(13,"вы находитесь в радиоактивной зоне, ученые начали использовать шаровые молнии для получения электричества, вокруг вас все перегорождена, так как станции эффективны, но опасные");
        about.put(14,"Вы на улице и тут на удивление не холода, хотя и зима, повсюдо светло, тепло, но пусто, пусто так как будто тут никого нет.... даже машин....");
        about.put(15,"центр города самое развитое и дорогое место, куда не посмотри люди куда-то спешат, а кто-то закупается в магазине...\n");

    }

}
