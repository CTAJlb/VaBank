package Data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 16.12.2014.
 */
public class TestDataProvider {

    @DataProvider(name = "C49066", parallel = false)
    public static Iterator<Object[]> createDataC49066() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"ПРАВИЛА КАЗИНО"});

        return data.iterator();
    }

    @DataProvider(name = "C49067", parallel = false)
    public static Iterator<Object[]> createDataC49067() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"ВХОД"});

        return data.iterator();
    }

    @DataProvider(name = "C49068", parallel = false)
    public static Iterator<Object[]> createDataC49068() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", false, true});

        return data.iterator();
    }

    //
    @DataProvider(name = "C49069", parallel = false)
    public static Iterator<Object[]> createDataC49069() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", true, true});

        return data.iterator();
    }

    @DataProvider(name = "C49070", parallel = false)
    public static Iterator<Object[]> createDataC49070() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"RUB", true, true});

        return data.iterator();
    }

    //
    @DataProvider(name = "C49071", parallel = false)
    public static Iterator<Object[]> createDataC49071() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"RUB", false, true});

        return data.iterator();
    }

    @DataProvider(name = "C49072", parallel = false)
    public static Iterator<Object[]> createDataC49072() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"Значение не должно быть пустым."});

        return data.iterator();
    }

    @DataProvider(name = "C49073", parallel = false)
    public static Iterator<Object[]> createDataC49073() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"Подтвердите, что ознакомились с правилами клуба и согласны с ними"});

        return data.iterator();
    }

    @DataProvider(name = "C49074", parallel = false)
    public static Iterator<Object[]> createDataC49074() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", "Пользователь с таким логином уже зарегистрирован, введите другой", true, true});

        return data.iterator();
    }

    @DataProvider(name = "C49075", parallel = false)
    public static Iterator<Object[]> createDataC49075() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", "Такой email уже занят", true, true});

        return data.iterator();
    }

    @DataProvider(name = "C49076", parallel = false)
    public static Iterator<Object[]> createDataC49076() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", "Пользователь с таким логином уже зарегистрирован, введите другой", "Пользователь с таким email уже зарегистрирован, введите другой", true, true});

        return data.iterator();
    }

    @DataProvider(name = "C49077", parallel = false)
    public static Iterator<Object[]> createDataC49077() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", "Значение адреса электронной почты недопустимо.", true, true});

        return data.iterator();
    }


    @DataProvider(name = "C49078", parallel = false)
    public static Iterator<Object[]> createDataC49078() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", "Значение недопустимо.", true, true});

        return data.iterator();
    }

    @DataProvider(name = "C49079", parallel = false)
    public static Iterator<Object[]> createDataC49079() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", "Значение адреса электронной почты недопустимо.", true, true});

        return data.iterator();
    }

    @DataProvider(name = "C49080", parallel = false)
    public static Iterator<Object[]> createDataC49080() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", "Пароль должен содержать от 6 до 32 символов, только латинские буквы и цифры", true, true});

        return data.iterator();
    }

    @DataProvider(name = "C49081", parallel = false)
    public static Iterator<Object[]> createDataC49081() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", "Значение недопустимо.", true, true});

        return data.iterator();
    }

    @DataProvider(name = "C49082", parallel = false)
    public static Iterator<Object[]> createDataC49082() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", "E-mail должен содержать от 6 до 35 символов", true, true});

        return data.iterator();
    }

    @DataProvider(name = "C49083", parallel = false)
    public static Iterator<Object[]> createDataC49083() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", "Пароль должен содержать от 6 до 32 символов, только латинские буквы и цифры", true, true});

        return data.iterator();

    }

        @DataProvider(name = "C49189", parallel = false)
        public static Iterator<Object[]> createDataC49189() {
            List<Object[]> data = new ArrayList<>();
            data.add(new Object[]{"USD"});

            return data.iterator();

    }

    @DataProvider(name = "C49084", parallel = false)
    public static Iterator<Object[]> createDataC49084() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD"});

        return data.iterator();

    }



    @DataProvider(name = "C49085", parallel = false)
    public static Iterator<Object[]> createDataC49085() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{});

        return data.iterator();

    }

    @DataProvider(name = "C49086", parallel = false)
    public static Iterator<Object[]> createDataC49086() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{});

        return data.iterator();

    }

    @DataProvider(name = "C49087", parallel = false)
    public static Iterator<Object[]> createDataC49087() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{});

        return data.iterator();

    }

    @DataProvider(name = "C49088", parallel = false)
    public static Iterator<Object[]> createDataC49088() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{});

        return data.iterator();

    }

    @DataProvider(name = "C49089", parallel = false)
    public static Iterator<Object[]> createDataC49089() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"1", "vkontakte", "+380685266123", "34hp9erio3h", "USD"});
        return data.iterator();

    }

    @DataProvider(name = "C49090", parallel = false)
    public static Iterator<Object[]> createDataC49090() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"1", "gmail", "alxttrv@gmail.com", "329hfw321", "USD"});

        return data.iterator();

    }

    @DataProvider(name = "C49091", parallel = false)
    public static Iterator<Object[]> createDataC49091() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"1", "mailru", "alxttrv", "34hkjdf23", "USD"});

        return data.iterator();

    }

    @DataProvider(name = "C49092", parallel = false)
    public static Iterator<Object[]> createDataC49092() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"1", "yandex", "alxttrv", "34hkjdf23", "USD"});

        return data.iterator();

    }

    @DataProvider(name = "C49093", parallel = false)
    public static Iterator<Object[]> createDataC49093() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"1", "odnoklasniki", "alxttrv@gmail.com", "33esd4r21", "USD"});
        return data.iterator();

    }

    @DataProvider(name = "C49094", parallel = false)
    public static Iterator<Object[]> createDataC49094() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"1", "facebook", "varomir@meta.ua", "34hkjdf23", "USD"});

        return data.iterator();

    }

    @DataProvider(name = "C49095", parallel = false)
    public static Iterator<Object[]> createDataC49095() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"1", "twitter", "alxttrv@gmail.com", "34hkjdf23", "USD"});

        return data.iterator();

    }

    @DataProvider(name = "C49512", parallel = false)
    public static Iterator<Object[]> createDataC49512() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD"});


        return data.iterator();

    }


    @DataProvider(name = "C49513", parallel = false)
    public static Iterator<Object[]> createDataC49513() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD"});

        return data.iterator();

    }

    @DataProvider(name = "C49514", parallel = false)
    public static Iterator<Object[]> createDataC49514() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD"});

        return data.iterator();

    }

    @DataProvider(name = "C49528", parallel = false)
    public static Iterator<Object[]> createDataC49528() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD"});

        return data.iterator();

    }

    @DataProvider(name = "C49529", parallel = false)
    public static Iterator<Object[]> createDataC49529() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD"});

        return data.iterator();

    }

    @DataProvider(name = "C49550", parallel = false)
    public static Iterator<Object[]> createDataC49550() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD"});

        return data.iterator();

    }

    @DataProvider(name = "C49520", parallel = false)
    public static Iterator<Object[]> createDataC49520() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", false, true});

        return data.iterator();
    }

    @DataProvider(name = "C49522", parallel = false)
    public static Iterator<Object[]> createDataC49522() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", false, true});

        return data.iterator();
    }
    @DataProvider(name = "C49523", parallel = false)
    public static Iterator<Object[]> createDataC49523() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"USD", false, true});

        return data.iterator();
    }

    @DataProvider(name = "C50634", parallel=false)
    public static Iterator<Object[]> createDataC50634() {
        List<Object[]> data = new ArrayList<Object[]>();

        data.add(new Object[]{"BookOfRa", "book_of_ra2_o", "play/BookOfRa/demo"});
        data.add(new Object[]{"GonzosQuest", "gonzo_quest", "play/GonzosQuest/demo"});
        data.add(new Object[]{"DiamondTrio", "diamond_trio", "play/DiamondTrio/demo"});
        data.add(new Object[]{"BookOfRaDeluxe", "book_of_ra2_deluxe", "play/BookOfRaDeluxe/demo"});
        data.add(new Object[]{"Circus", "circus", "play/Circus/demo"});
        data.add(new Object[]{"DraculasFamily", "draculas_family_b", "play/DraculasFamily/demo"});
        data.add(new Object[]{"Zombirthday", "zombirthday_b", "play/Zombirthday/demo"});
        data.add(new Object[]{"WildHunter", "wild_hunter_b", "play/WildHunter/demo"});
        data.add(new Object[]{"MerryChristmas", "merry_christmas_b", "play/MerryChristmas/demo"});
        data.add(new Object[]{"RouletteEuro", "roulette", "play/RouletteEuro/demo"});
        data.add(new Object[]{"PokerPaigow", "paigowpoker", "play/PokerPaigow/demo"});
        data.add(new Object[]{"RouletteBull", "bull", "play/RouletteBull/demo"});
        data.add(new Object[]{"Slotopol", "slotopol", "play/Slotopol/demo"});
        data.add(new Object[]{"Aquatica", "aquatica_b", "play/Aquatica/demo"});
        data.add(new Object[]{"LuckyBirds", "lucky_birds_b", "play/LuckyBirds/demo"});
        data.add(new Object[]{"FruitsAndStars", "fruits_n_stars_b", "play/FruitsAndStars/demo"});
        data.add(new Object[]{"JuiceNFruits", "juice_and_fruits_b", "play/JuiceNFruits/demo"});
        data.add(new Object[]{"LuckyReels", "lucky_reels_b", "play/LuckyReels/demo"});
        data.add(new Object[]{"Odysseus", "odysseus_b", "play/Odysseus/demo"});
        data.add(new Object[]{"SkyWay", "sky_way_b", "play/SkyWay/demo"});
        data.add(new Object[]{"Garage", "garage", "play/Garage/demo"});
        data.add(new Object[]{"CircusHD", "circus_hd", "play/CircusHD/demo"});
        data.add(new Object[]{"TreasuresOfTombs", "treasures_of_tombs_free", "play/TreasuresOfTombs/demo"});
        data.add(new Object[]{"TreasuresOfTombsBonus", "treasures_of_tombs_bonus", "play/TreasuresOfTombsBonus/demo"});
        data.add(new Object[]{"Resident", "resident2", "play/Resident/demo"});
        data.add(new Object[]{"Island", "island", "play/Island/demo"});
        data.add(new Object[]{"Keks", "keks", "play/Keks/demo"});
        data.add(new Object[]{"SweetLife", "sweet_life2", "play/SweetLife/demo"});
        data.add(new Object[]{"Pirate", "pirate2", "play/Pirate/demo"});
        data.add(new Object[]{"CrazyMonkey2", "crazy_monkey_deluxe", "play/CrazyMonkey2/demo"});
        data.add(new Object[]{"FruitCocktail2", "fruit_cocktail_deluxe", "play/FruitCocktail2/demo"});
        data.add(new Object[]{"TheMoneyGame", "moneygame2_o", "play/TheMoneyGame/demo"});
        data.add(new Object[]{"BananasGoBahamas", "bananagobahamas2_o", "play/BananasGoBahamas/demo"});
        data.add(new Object[]{"LuckyLadysCharm", "lucky_ladies_charm2_o", "play/LuckyLadysCharm/demo"});
        data.add(new Object[]{"Attila", "atilla2", "play/Attila/demo"});
        data.add(new Object[]{"PolarFox", "polar_fox2", "play/PolarFox/demo"});
        data.add(new Object[]{"Columbus", "columbus2_o", "play/Columbus/demo"});
        data.add(new Object[]{"MarcoPolo", "marco_polo_o", "play/MarcoPolo/demo"});
        data.add(new Object[]{"UltraHot", "ultrahot_o", "play/UltraHot/demo"});
        data.add(new Object[]{"DolphinsPearlDeluxe", "dolphins_pearl2_deluxe", "play/DolphinsPearlDeluxe/demo"});
        data.add(new Object[]{"GoldenArk", "golden_ark_deluxe", "play/GoldenArk/demo"});
        data.add(new Object[]{"LordOcean", "lord_ocean_deluxe", "play/LordOcean/demo"});
        data.add(new Object[]{"JustJewelsDeluxe", "just_jewels_deluxe", "play/JustJewelsDeluxe/demo"});
        data.add(new Object[]{"HotChanceDeluxe", "hot_chance_deluxe", "play/HotChanceDeluxe/demo"});
        data.add(new Object[]{"MysticSecrets", "mystic_secrets_deluxe", "play/MysticSecrets/demo"});
        data.add(new Object[]{"Partygameslotto", "partygameslotto_deluxe", "play/Partygameslotto/demo"});
        data.add(new Object[]{"SecretsSand", "secrets_sand_deluxe", "play/SecretsSand/demo"});
        data.add(new Object[]{"PharaonsringsDeluxe", "pharaonsrings_deluxe", "play/PharaonsringsDeluxe/demo"});
        data.add(new Object[]{"Blackjack", "blackjack", "play/Blackjack/demo"});
        data.add(new Object[]{"BlackjackCaribbean", "blackjack_caribbean", "play/BlackjackCaribbean/demo"});
        data.add(new Object[]{"PokerOasis", "oasispoker", "play/PokerOasis/demo"});
        data.add(new Object[]{"Baccarat", "baccarat", "play/Baccarat/demo"});
//        data.add(new Object[]{"flamedancer_deluxe", "flamedancer_deluxe", "play/flamedancer_deluxe/demo"}); game disable
//        data.add(new Object[]{"beetlmania_deluxe", "beetlmania_deluxe", "play/beetlmania_deluxe/demo"}); game disable
        data.add(new Object[]{"Reddog", "reddog", "play/Reddog/demo"});
        data.add(new Object[]{"RouletteBlankspin", "roulette", "play/RouletteBlankspin/demo"});
        data.add(new Object[]{"RouletteTrack", "french_roulette_track", "play/RouletteTrack/demo"});
        data.add(new Object[]{"FairyLand", "fairy_land", "play/FairyLand/demo"});
        data.add(new Object[]{"LuckyDrink", "lucky_drink", "play/LuckyDrink/demo"});
        data.add(new Object[]{"AztecsGold", "aztecagold_o", "play/AztecsGold/demo"});
        data.add(new Object[]{"Kong", "king_kong", "play/Kong/demo"});
        data.add(new Object[]{"DesertTreasure", "desert_treasures", "play/DesertTreasure/demo"});
        data.add(new Object[]{"DrLovemore", "dr_lovemore", "play/DrLovemore/demo"});
        data.add(new Object[]{"BlackjackExposure", "blackjack_exposure", "play/BlackjackExposure/demo"});
        data.add(new Object[]{"LuckyLadysCharmDeluxe", "lucky_ladies_charm2_deluxe", "play/LuckyLadysCharmDeluxe/demo"});
        data.add(new Object[]{"NightOut", "nightout", "play/NightOut/demo"});
        data.add(new Object[]{"SizzlingHotDeluxe", "sizzling_hot2_deluxe", "play/SizzlingHotDeluxe/demo"});
        data.add(new Object[]{"SlotopolDeluxe", "slotopol_deluxe", "play/SlotopolDeluxe/demo"});
        data.add(new Object[]{"BlackjackThreecard", "blackjack_threecard", "play/BlackjackThreecard/demo"});
        data.add(new Object[]{"BlackjackAmerican", "blackjack_american", "play/BlackjackAmerican/demo"});
        data.add(new Object[]{"BlackjackSwitch", "blackjack_switch6", "play/BlackjackSwitch/demo"});
        data.add(new Object[]{"RouletteZeroLess", "roulette_zero_less", "play/RouletteZeroLess/demo"});
        data.add(new Object[]{"RouletteAdviser", "french_roulette_tr2", "play/RouletteAdviser/demo"});
        data.add(new Object[]{"BlackjackSpain", "blackjack_spain", "play/BlackjackSpain/demo"});
        data.add(new Object[]{"RouletteHD", "french_roulette_tr3", "play/RouletteHD/demo"});
        data.add(new Object[]{"RouletteCard", "roulette_card", "play/RouletteCard/demo"});
        data.add(new Object[]{"RouletteAlpha", "roulette_letter", "play/RouletteAlpha/demo"});
        data.add(new Object[]{"PokerRussian", "russianpoker2", "play/PokerRussian/demo"});
        data.add(new Object[]{"FruitsOfRa", "fruits_of_ra_b", "play/FruitsOfRa/demo"});
        data.add(new Object[]{"LuckyPiratesHD", "lucky_pirates_b", "play/LuckyPiratesHD/demo"});
        data.add(new Object[]{"MagicForestHD", "magic_forest_b", "play/MagicForestHD/demo"});
        data.add(new Object[]{"SpiritOfAztec", "spirit_of_aztec", "play/SpiritOfAztec/demo",});
        data.add(new Object[]{"ThunderReels", "thunder_reels_b", "play/ThunderReels/demo",});
        data.add(new Object[]{"Fairyqueen", "fairyqueen_deluxe", "play/Fairyqueen/demo",});
        data.add(new Object[]{"CrazyMonkey", "crazy_monkey2", "play/CrazyMonkey/demo",});
        data.add(new Object[]{"PiratesTreasures", "pirat_hd", "play/PiratesTreasures/demo",});
        data.add(new Object[]{"NotreDames", "notre_dames", "play/NotreDames/demo",});
        data.add(new Object[]{"AztecEmpire", "aztec_empire", "play/AztecEmpire/demo",});
        data.add(new Object[]{"HappyJungleDeluxe", "happy_jungle_deluxe_b", "play/HappyJungleDeluxe/demo",});
        data.add(new Object[]{"FruitCocktail", "fruit_cocktail", "play/FruitCocktail/demo"});
        data.add(new Object[]{"LuckyHaunter", "lucky_haunter2", "play/LuckyHaunter/demo"});
        data.add(new Object[]{"RockClimber", "rock_climber", "play/RockClimber/demo"});
        data.add(new Object[]{"SizzlingHot", "sizzling_hot2_o", "play/SizzlingHot/demo"});
        data.add(new Object[]{"DolphinsPearl", "dolphins_pearl2_o", "play/DolphinsPearl/demo"});
        data.add(new Object[]{"UnicornMagic", "unicorn_magic3", "play/UnicornMagic/demo"});
        data.add(new Object[]{"Bratva", "bratva", "play/Bratva/demo"});
        data.add(new Object[]{"BananaSplash", "banana_splash2", "play/BananaSplash/demo"});
        data.add(new Object[]{"QueenOfHearts", "queen_of_hearts_o", "play/QueenOfHearts/demo"});
        data.add(new Object[]{"PharaonsGold", "pharaons_gold2", "play/PharaonsGold/demo"});
        data.add(new Object[]{"DynastyOfMing", "dynasty_ming2", "play/DynastyOfMing/demo"});
//        data.add(new Object[]{"BeetleMania", "beetle_mania", "play/BeetleMania/demo"}); game disable
        data.add(new Object[]{"UltraHotDeluxe", "ultrahot_deluxe", "play/UltraHotDeluxe/demo"});
        data.add(new Object[]{"ColumbusDeluxe", "columbus_deluxe", "play/ColumbusDeluxe/demo"});
        data.add(new Object[]{"LuckyroseDeluxe", "luckyrose_deluxe", "play/LuckyroseDeluxe/demo"});
        data.add(new Object[]{"Cashfarm", "cashfarm_deluxe", "play/Cashfarm/demo"});
        data.add(new Object[]{"PokerCaribbean", "caribbeanpoker", "play/PokerCaribbean/demo"});
        data.add(new Object[]{"RouletteUsa", "roulette_usa", "play/RouletteUsa/demo"});
        data.add(new Object[]{"PokerThreeCards", "threecardpoker", "play/PokerThreeCards/demo"});
        data.add(new Object[]{"ChampagneParty", "champagne_party", "play/ChampagneParty/demo"});
//        data.add(new Object[]{"PokerSixCards", "sixcardspoker", "play/PokerSixCards/demo"}); game disable
        data.add(new Object[]{"CasinoWar", "casinowar", "play/CasinoWar/demo"});
//        data.add(new Object[]{"SlotExcalibur", "excalibur", "play/SlotExcalibur/demo"}); game disable
        data.add(new Object[]{"AliceInWonderslots", "alice_b", "play/AliceInWonderslots/demo"});
        data.add(new Object[]{"RichesOfCleopatra", "riches_of_cleopatra", "play/RichesOfCleopatra/demo"});
        data.add(new Object[]{"TennisGame", "tennis_game", "play/TennisGame/demo"});
        data.add(new Object[]{"EgyptTreasures", "egypt_treasures", "play/EgyptTreasures/demo"});
        data.add(new Object[]{"Fairytale", "fairytale", "play/Fairytale/demo"});
        data.add(new Object[]{"Sharky", "sharky3", "play/Sharky/demo"});
        data.add(new Object[]{"Keno", "keno", "play/Keno/demo"});
        data.add(new Object[]{"FortuneWheel", "fortune_wheel", "play/FortuneWheel/demo"});
        data.add(new Object[]{"Craps", "craps_vabank", "play/Craps/demo"});
        data.add(new Object[]{"Sicbo", "sicbo_vabank", "play/Sicbo/demo"});
        data.add(new Object[]{"BlackjackVB", "blackjack_vabank", "play/BlackjackVB/demo"});
        data.add(new Object[]{"Videopokerama", "videopokerama", "play/Videopokerama/demo"});
        data.add(new Object[]{"SlotBusinessman", "businessman", "play/SlotBusinessman/demo"});
        data.add(new Object[]{"Taiga", "taiga_b", "play/Taiga/demo"});
        data.add(new Object[]{"FruitsAndRoyals", "fruits_and_royals_deluxe", "play/FruitsAndRoyals/demo"});
        data.add(new Object[]{"HoldemPoker", "holdempoker", "play/HoldemPoker/demo"});
        data.add(new Object[]{"JokerPoker", "jokerpoker", "play/JokerPoker/demo"});
        data.add(new Object[]{"TensOrBetter", "tens_or_better", "play/TensOrBetter/demo"});
        data.add(new Object[]{"MultilineJacksOrBetter", "jacksorbetter_five", "play/MultilineJacksOrBetter/demo"});
        data.add(new Object[]{"DeucesAndJoker", "deuces_and_joker", "play/DeucesAndJoker/demo"});
        data.add(new Object[]{"AcesAndFaces", "aces_and_faces", "play/AcesAndFaces/demo"});
        data.add(new Object[]{"DoubleTriple", "doubletriple", "play/DoubleTriple/demo"});
//        data.add(new Object[]{"SlotBigSam", "big_sam", "play/SlotBigSam/demo"}); game disable
//        data.add(new Object[]{"SlotFiveLines", "fivelines", "play/SlotFiveLines/demo"}); game disable
//        data.add(new Object[]{"SlotFruitMachine", "fruit", "play/SlotFruitMachine/demo"}); game disable
//        data.add(new Object[]{"SlotVabank", "vabank", "play/SlotVabank/demo"}); game disable
//        data.add(new Object[]{"SlotGoldenRoad", "goldenroad", "play/SlotGoldenRoad/demo"}); game disable
//        data.add(new Object[]{"SlotFruitMania", "fruitmania", "play/SlotFruitMania/demo"}); game disable
//        data.add(new Object[]{"SlotStripBar", "stripbar", "play/SlotStripBar/demo"}); game disable
//        data.add(new Object[]{"SlotTreasureIsland", "mysteriousisland", "play/SlotTreasureIsland/demo"}); game disable
        data.add(new Object[]{"SlotCrazyparty", "crazyparty", "play/SlotCrazyparty/demo"});
        data.add(new Object[]{"SlotCrazyparty2", "crazyparty2", "play/SlotCrazyparty2/demo"});
        data.add(new Object[]{"IncredibleHulk", "incredible_hulk", "play/IncredibleHulk/demo"});
        data.add(new Object[]{"SlotKangaroo", "kangaroo", "play/SlotKangaroo/demo"});
        data.add(new Object[]{"SlotHappyNewYear", "happyny", "play/SlotHappyNewYear/demo"});
        data.add(new Object[]{"SlotHappyNewYear2", "happyny2", "play/SlotHappyNewYear2/demo"});
        data.add(new Object[]{"Madagascar", "madagascar2", "play/Madagascar/demo"});
        data.add(new Object[]{"PirateTreasures", "pirat", "play/PirateTreasures/demo"});
        data.add(new Object[]{"SlotAlchemist", "alchemist", "play/SlotAlchemist/demo"});
//        data.add(new Object[]{"SlotBlingBling2", "blingbling2", "play/SlotBlingBling2/demo"}); game disable
        data.add(new Object[]{"SlotDosafe", "dosafe", "play/SlotDosafe/demo"});
        data.add(new Object[]{"SlotGoldrush", "goldrush", "play/SlotGoldrush/demo"});
        data.add(new Object[]{"SlotSpaceAdventure", "spaceadventure", "play/SlotSpaceAdventure/demo"});
        data.add(new Object[]{"SlotWildHoney", "wildhoney", "play/SlotWildHoney/demo"});
        data.add(new Object[]{"LuckyHunting", "lucky_hunting", "play/LuckyHunting/demo"});
        data.add(new Object[]{"CrazyDoctor", "crazy_doctor", "play/CrazyDoctor/demo"});
        data.add(new Object[]{"CrazyDoctor2", "crazy_doctor2", "play/CrazyDoctor2/demo"});
        data.add(new Object[]{"Formula1", "formula_1", "play/Formula1/demo",});
        data.add(new Object[]{"Kavkaz", "kavkaz3", "play/Kavkaz/demo"});
        data.add(new Object[]{"SexyChess", "sexy_chess", "play/SexyChess/demo",});
        data.add(new Object[]{"MagicWar", "magic_war", "play/MagicWar/demo"});
        data.add(new Object[]{"Gladiators", "gladiators", "play/Gladiators/demo"});
        data.add(new Object[]{"FruitSensation", "fruit_sensation_deluxe", "play/FruitSensation/demo"});
        data.add(new Object[]{"DeucesWild", "deuceswild", "play/DeucesWild/demo"});
        data.add(new Object[]{"JacksOrBetterMultiline", "multiline_jacks_or_better", "play/JacksOrBetterMultiline/demo"});
        data.add(new Object[]{"SevensWild", "sevenswild", "play/SevensWild/demo"});
        data.add(new Object[]{"SevensAndJokerWild", "sevens_and_joker", "play/SevensAndJokerWild/demo"});
        data.add(new Object[]{"DoubleJokerPoker", "doublejokerpoker", "play/DoubleJokerPoker/demo"});
        data.add(new Object[]{"FiveJokerPoker", "fivejokerpoker", "play/FiveJokerPoker/demo"});
        data.add(new Object[]{"JacksOrBetter", "jacksorbetter", "play/JacksOrBetter/demo"});
        data.add(new Object[]{"BloodSuckers", "blood_suckers", "play/BloodSuckers/demo"});
        data.add(new Object[]{"CrazyFruit", "crazy_fruit_urartu", "play/CrazyFruit/demo"});
        data.add(new Object[]{"IronMan", "iron_man", "play/IronMan/demo"});
        data.add(new Object[]{"ZolotoPartii", "zoloto_partii", "play/ZolotoPartii/demo"});
        data.add(new Object[]{"OliversBar", "olivers_bar", "play/OliversBar/demo"});
        data.add(new Object[]{"Ramses2", "ramses2", "play/Ramses2/demo"});
        data.add(new Object[]{"SafariHeat", "safari_heat", "play/SafariHeat/demo"});
        data.add(new Object[]{"MermaidsPearl", "mermaids_pearl", "play/MermaidsPearl/demo"});
        data.add(new Object[]{"SecretForest", "secret_forest", "play/SecretForest/demo"});
        data.add(new Object[]{"PharaonsGold3", "pharaons_gold3", "play/PharaonsGold3/demo"});
        data.add(new Object[]{"GryphonsGold", "gryphons_gold", "play/GryphonsGold/demo"});
        data.add(new Object[]{"KingOfCards", "king_of_cards", "play/KingOfCards/demo"});
        data.add(new Object[]{"MagicPrincess", "magic_princess", "play/MagicPrincess/demo"});
        data.add(new Object[]{"AlwaysHot", "always_hot", "play/AlwaysHot/demo"});
        data.add(new Object[]{"RoyalTreasures", "royal_treasures", "play/RoyalTreasures/demo"});
        data.add(new Object[]{"GoldenPlanet", "golden_planet", "play/GoldenPlanet/demo"});
        data.add(new Object[]{"TheMagicFlute", "the_magic_flute", "play/TheMagicFlute/demo"});
//        =175 games=
        return data.iterator();
    }

        @DataProvider(name = "C50635", parallel=false)
        public static Iterator<Object[]> createDataC50635() {
            List<Object[]> data = new ArrayList<Object[]>();

            data.add(new Object[]{"BookOfRa", "book_of_ra2_o", "play/BookOfRa"});
            data.add(new Object[]{"GonzosQuest", "gonzo_quest", "play/GonzosQuest"});
            data.add(new Object[]{"DiamondTrio", "diamond_trio", "play/DiamondTrio"});
            data.add(new Object[]{"BookOfRaDeluxe", "book_of_ra2_deluxe", "play/BookOfRaDeluxe"});
            data.add(new Object[]{"Circus", "circus", "play/Circus"});
            data.add(new Object[]{"DraculasFamily", "draculas_family_b", "play/DraculasFamily"});
            data.add(new Object[]{"Zombirthday", "zombirthday_b", "play/Zombirthday"});
            data.add(new Object[]{"WildHunter", "wild_hunter_b", "play/WildHunter"});
            data.add(new Object[]{"MerryChristmas", "merry_christmas_b", "play/MerryChristmas"});
            data.add(new Object[]{"RouletteEuro", "roulette", "play/RouletteEuro/1"});
            data.add(new Object[]{"PokerPaigow", "paigowpoker", "play/PokerPaigow"});
            data.add(new Object[]{"RouletteBull", "bull", "play/RouletteBull/1"});
            data.add(new Object[]{"Slotopol", "slotopol", "play/Slotopol"});
            data.add(new Object[]{"Aquatica", "aquatica_b", "play/Aquatica"});
            data.add(new Object[]{"FruitsAndStars", "fruits_n_stars_b", "play/FruitsAndStars"});
            data.add(new Object[]{"JuiceNFruits", "juice_and_fruits_b", "play/JuiceNFruits"});
            data.add(new Object[]{"LuckyReels", "lucky_reels_b", "play/LuckyReels"});
            data.add(new Object[]{"Odysseus", "odysseus_b", "play/Odysseus"});
            data.add(new Object[]{"SkyWay", "sky_way_b", "play/SkyWay"});
            data.add(new Object[]{"Garage", "garage", "play/Garage"});
            data.add(new Object[]{"CircusHD", "circus_hd", "play/CircusHD"});
            data.add(new Object[]{"TreasuresOfTombs", "treasures_of_tombs_free", "play/TreasuresOfTombs"});
            data.add(new Object[]{"TreasuresOfTombsBonus", "treasures_of_tombs_bonus", "play/TreasuresOfTombsBonus"});
            data.add(new Object[]{"Resident", "resident2", "play/Resident"});
            data.add(new Object[]{"Island", "island", "play/Island"});
            data.add(new Object[]{"Keks", "keks", "play/Keks"});
            data.add(new Object[]{"SweetLife", "sweet_life2", "play/SweetLife"});
            data.add(new Object[]{"Pirate", "pirate2", "play/Pirate"});
            data.add(new Object[]{"CrazyMonkey2", "crazy_monkey_deluxe", "play/CrazyMonkey2"});
            data.add(new Object[]{"FruitCocktail2", "fruit_cocktail_deluxe", "play/FruitCocktail2"});
            data.add(new Object[]{"TheMoneyGame", "moneygame2_o", "play/TheMoneyGame"});
            data.add(new Object[]{"BananasGoBahamas", "bananagobahamas2_o", "play/BananasGoBahamas"});
            data.add(new Object[]{"LuckyLadysCharm", "lucky_ladies_charm2_o", "play/LuckyLadysCharm"});
            data.add(new Object[]{"Attila", "atilla2", "play/Attila"});
            data.add(new Object[]{"PolarFox", "polar_fox2", "play/PolarFox"});
            data.add(new Object[]{"Columbus", "columbus2_o", "play/Columbus"});
            data.add(new Object[]{"MarcoPolo", "marco_polo_o", "play/MarcoPolo"});
            data.add(new Object[]{"UltraHot", "ultrahot_o", "play/UltraHot"});
            data.add(new Object[]{"DolphinsPearlDeluxe", "dolphins_pearl2_deluxe", "play/DolphinsPearlDeluxe"});
            data.add(new Object[]{"GoldenArk", "golden_ark_deluxe", "play/GoldenArk"});
            data.add(new Object[]{"LordOcean", "lord_ocean_deluxe", "play/LordOcean"});
            data.add(new Object[]{"JustJewelsDeluxe", "just_jewels_deluxe", "play/JustJewelsDeluxe"});
            data.add(new Object[]{"HotChanceDeluxe", "hot_chance_deluxe", "play/HotChanceDeluxe"});
            data.add(new Object[]{"MysticSecrets", "mystic_secrets_deluxe", "play/MysticSecrets"});
            data.add(new Object[]{"Partygameslotto", "partygameslotto_deluxe", "play/Partygameslotto"});
            data.add(new Object[]{"SecretsSand", "secrets_sand_deluxe", "play/SecretsSand"});
            data.add(new Object[]{"PharaonsringsDeluxe", "pharaonsrings_deluxe", "play/PharaonsringsDeluxe"});
            data.add(new Object[]{"Blackjack", "blackjack", "play/Blackjack/1"});
            data.add(new Object[]{"BlackjackCaribbean", "blackjack_caribbean", "play/BlackjackCaribbean"});
            data.add(new Object[]{"PokerOasis", "oasispoker", "play/PokerOasis"});
            data.add(new Object[]{"Baccarat", "baccarat", "play/Baccarat"});
//        data.add(new Object[]{"flamedancer_deluxe", "flamedancer_deluxe", "play/flamedancer_deluxe/demo"}); game disable
//        data.add(new Object[]{"beetlmania_deluxe", "beetlmania_deluxe", "play/beetlmania_deluxe/demo"}); game disable
            data.add(new Object[]{"Reddog", "reddog", "play/Reddog"});
            data.add(new Object[]{"RouletteBlankspin", "roulette", "play/RouletteBlankspin/1"});
            data.add(new Object[]{"RouletteTrack", "french_roulette_track", "play/RouletteTrack/1"});
            data.add(new Object[]{"FairyLand", "fairy_land", "play/FairyLand"});
            data.add(new Object[]{"LuckyDrink", "lucky_drink", "play/LuckyDrink"});
            data.add(new Object[]{"AztecsGold", "aztecagold_o", "play/AztecsGold"});
            data.add(new Object[]{"Kong", "king_kong", "play/Kong"});
            data.add(new Object[]{"DesertTreasure", "desert_treasures", "play/DesertTreasure"});
            data.add(new Object[]{"DrLovemore", "dr_lovemore", "play/DrLovemore"});
            data.add(new Object[]{"BlackjackExposure", "blackjack_exposure", "play/BlackjackExposure"});
            data.add(new Object[]{"LuckyLadysCharmDeluxe", "lucky_ladies_charm2_deluxe", "play/LuckyLadysCharmDeluxe"});
            data.add(new Object[]{"NightOut", "nightout", "play/NightOut"});
            data.add(new Object[]{"SizzlingHotDeluxe", "sizzling_hot2_deluxe", "play/SizzlingHotDeluxe"});
            data.add(new Object[]{"SlotopolDeluxe", "slotopol_deluxe", "play/SlotopolDeluxe"});
            data.add(new Object[]{"BlackjackThreecard", "blackjack_threecard", "play/BlackjackThreecard"});
            data.add(new Object[]{"BlackjackAmerican", "blackjack_american", "play/BlackjackAmerican"});
            data.add(new Object[]{"BlackjackSwitch", "blackjack_switch6", "play/BlackjackSwitch/1"});
            data.add(new Object[]{"RouletteZeroLess", "roulette_zero_less", "play/RouletteZeroLess/1"});
            data.add(new Object[]{"RouletteAdviser", "french_roulette_tr2", "play/RouletteAdviser"});
            data.add(new Object[]{"BlackjackSpain", "blackjack_spain", "play/BlackjackSpain"});
            data.add(new Object[]{"RouletteHD", "french_roulette_tr3", "play/RouletteHD/1"});
            data.add(new Object[]{"RouletteCard", "roulette_card", "play/RouletteCard/1"});
            data.add(new Object[]{"RouletteAlpha", "roulette_letter", "play/RouletteAlpha/1"});
            data.add(new Object[]{"PokerRussian", "russianpoker2", "play/PokerRussian"});
            data.add(new Object[]{"FruitsOfRa", "fruits_of_ra_b", "play/FruitsOfRa"});
            data.add(new Object[]{"LuckyPiratesHD", "lucky_pirates_b", "play/LuckyPiratesHD"});
            data.add(new Object[]{"MagicForestHD", "magic_forest_b", "play/MagicForestHD"});
            data.add(new Object[]{"SpiritOfAztec", "spirit_of_aztec", "play/SpiritOfAztec",});
            data.add(new Object[]{"ThunderReels", "thunder_reels_b", "play/ThunderReels",});
            data.add(new Object[]{"Fairyqueen", "fairyqueen_deluxe", "play/Fairyqueen",});
            data.add(new Object[]{"CrazyMonkey", "crazy_monkey2", "play/CrazyMonkey",});
            data.add(new Object[]{"PiratesTreasures", "pirat_hd", "play/PiratesTreasures",});
            data.add(new Object[]{"NotreDames", "notre_dames", "play/NotreDames",});
            data.add(new Object[]{"AztecEmpire", "aztec_empire", "play/AztecEmpire",});
            data.add(new Object[]{"HappyJungleDeluxe", "happy_jungle_deluxe_b", "play/HappyJungleDeluxe",});
            data.add(new Object[]{"FruitCocktail", "fruit_cocktail", "play/FruitCocktail"});
            data.add(new Object[]{"LuckyHaunter", "lucky_haunter2", "play/LuckyHaunter"});
            data.add(new Object[]{"RockClimber", "rock_climber", "play/RockClimber"});
            data.add(new Object[]{"SizzlingHot", "sizzling_hot2_o", "play/SizzlingHot"});
            data.add(new Object[]{"DolphinsPearl", "dolphins_pearl2_o", "play/DolphinsPearl"});
            data.add(new Object[]{"UnicornMagic", "unicorn_magic3", "play/UnicornMagic"});
            data.add(new Object[]{"Bratva", "bratva", "play/Bratva"});
            data.add(new Object[]{"BananaSplash", "banana_splash2", "play/BananaSplash"});
            data.add(new Object[]{"QueenOfHearts", "queen_of_hearts_o", "play/QueenOfHearts"});
            data.add(new Object[]{"PharaonsGold", "pharaons_gold2", "play/PharaonsGold"});
            data.add(new Object[]{"DynastyOfMing", "dynasty_ming2", "play/DynastyOfMing"});
//        data.add(new Object[]{"BeetleMania", "beetle_mania", "play/BeetleMania/demo"}); game disable
            data.add(new Object[]{"UltraHotDeluxe", "ultrahot_deluxe", "play/UltraHotDeluxe"});
            data.add(new Object[]{"ColumbusDeluxe", "columbus_deluxe", "play/ColumbusDeluxe"});
            data.add(new Object[]{"LuckyroseDeluxe", "luckyrose_deluxe", "play/LuckyroseDeluxe"});
            data.add(new Object[]{"Cashfarm", "cashfarm_deluxe", "play/Cashfarm"});
            data.add(new Object[]{"PokerCaribbean", "caribbeanpoker", "play/PokerCaribbean"});
            data.add(new Object[]{"RouletteUsa", "roulette_usa", "play/RouletteUsa/1"});
            data.add(new Object[]{"PokerThreeCards", "threecardpoker", "play/PokerThreeCards"});
            data.add(new Object[]{"ChampagneParty", "champagne_party", "play/ChampagneParty"});
//        data.add(new Object[]{"PokerSixCards", "sixcardspoker", "play/PokerSixCards/demo"}); game disable
            data.add(new Object[]{"CasinoWar", "casinowar", "play/CasinoWar"});
//        data.add(new Object[]{"SlotExcalibur", "excalibur", "play/SlotExcalibur/demo"}); game disable
            data.add(new Object[]{"AliceInWonderslots", "alice_b", "play/AliceInWonderslots"});
            data.add(new Object[]{"RichesOfCleopatra", "riches_of_cleopatra", "play/RichesOfCleopatra"});
            data.add(new Object[]{"TennisGame", "tennis_game", "play/TennisGame"});
            data.add(new Object[]{"EgyptTreasures", "egypt_treasures", "play/EgyptTreasures"});
            data.add(new Object[]{"Fairytale", "fairytale", "play/Fairytale"});
            data.add(new Object[]{"Sharky", "sharky3", "play/Sharky"});
            data.add(new Object[]{"Keno", "keno", "play/Keno"});
            data.add(new Object[]{"FortuneWheel", "fortune_wheel", "play/FortuneWheel"});
            data.add(new Object[]{"Craps", "craps_vabank", "play/Craps"});
            data.add(new Object[]{"Sicbo", "sicbo_vabank", "play/Sicbo"});
            data.add(new Object[]{"BlackjackVB", "blackjack_vabank", "play/BlackjackVB"});
            data.add(new Object[]{"Videopokerama", "videopokerama", "play/Videopokerama"});
            data.add(new Object[]{"SlotBusinessman", "businessman", "play/SlotBusinessman"});
            data.add(new Object[]{"Taiga", "taiga_b", "play/Taiga"});
            data.add(new Object[]{"FruitsAndRoyals", "fruits_and_royals_deluxe", "play/FruitsAndRoyals"});
            data.add(new Object[]{"HoldemPoker", "holdempoker", "play/HoldemPoker"});
            data.add(new Object[]{"JokerPoker", "jokerpoker", "play/JokerPoker"});
            data.add(new Object[]{"TensOrBetter", "tens_or_better", "play/TensOrBetter"});
            data.add(new Object[]{"MultilineJacksOrBetter", "jacksorbetter_five", "play/MultilineJacksOrBetter"});
            data.add(new Object[]{"DeucesAndJoker", "deuces_and_joker", "play/DeucesAndJoker"});
            data.add(new Object[]{"AcesAndFaces", "aces_and_faces", "play/AcesAndFaces"});
            data.add(new Object[]{"DoubleTriple", "doubletriple", "play/DoubleTriple"});
//        data.add(new Object[]{"SlotBigSam", "big_sam", "play/SlotBigSam/demo"}); game disable
//        data.add(new Object[]{"SlotFiveLines", "fivelines", "play/SlotFiveLines/demo"}); game disable
//        data.add(new Object[]{"SlotFruitMachine", "fruit", "play/SlotFruitMachine/demo"}); game disable
//        data.add(new Object[]{"SlotVabank", "vabank", "play/SlotVabank/demo"}); game disable
//        data.add(new Object[]{"SlotGoldenRoad", "goldenroad", "play/SlotGoldenRoad/demo"}); game disable
//        data.add(new Object[]{"SlotFruitMania", "fruitmania", "play/SlotFruitMania/demo"}); game disable
//        data.add(new Object[]{"SlotStripBar", "stripbar", "play/SlotStripBar/demo"}); game disable
//        data.add(new Object[]{"SlotTreasureIsland", "mysteriousisland", "play/SlotTreasureIsland/demo"}); game disable
            data.add(new Object[]{"SlotCrazyparty", "crazyparty", "play/SlotCrazyparty"});
            data.add(new Object[]{"SlotCrazyparty2", "crazyparty2", "play/SlotCrazyparty2"});
            data.add(new Object[]{"IncredibleHulk", "incredible_hulk", "play/IncredibleHulk"});
            data.add(new Object[]{"SlotKangaroo", "kangaroo", "play/SlotKangaroo"});
            data.add(new Object[]{"SlotHappyNewYear", "happyny", "play/SlotHappyNewYear"});
            data.add(new Object[]{"SlotHappyNewYear2", "happyny2", "play/SlotHappyNewYear2"});
            data.add(new Object[]{"Madagascar", "madagascar2", "play/Madagascar"});
            data.add(new Object[]{"PirateTreasures", "pirat", "play/PirateTreasures"});
            data.add(new Object[]{"SlotAlchemist", "alchemist", "play/SlotAlchemist"});
//        data.add(new Object[]{"SlotBlingBling2", "blingbling2", "play/SlotBlingBling2/demo"}); game disable
            data.add(new Object[]{"SlotDosafe", "dosafe", "play/SlotDosafe"});
            data.add(new Object[]{"SlotGoldrush", "goldrush", "play/SlotGoldrush"});
            data.add(new Object[]{"SlotSpaceAdventure", "spaceadventure", "play/SlotSpaceAdventure"});
            data.add(new Object[]{"SlotWildHoney", "wildhoney", "play/SlotWildHoney"});
            data.add(new Object[]{"LuckyHunting", "lucky_hunting", "play/LuckyHunting"});
            data.add(new Object[]{"CrazyDoctor", "crazy_doctor", "play/CrazyDoctor"});
            data.add(new Object[]{"CrazyDoctor2", "crazy_doctor2", "play/CrazyDoctor2"});
            data.add(new Object[]{"Formula1", "formula_1", "play/Formula1",});
            data.add(new Object[]{"Kavkaz", "kavkaz3", "play/Kavkaz"});
            data.add(new Object[]{"SexyChess", "sexy_chess", "play/SexyChess",});
            data.add(new Object[]{"MagicWar", "magic_war", "play/MagicWar"});
            data.add(new Object[]{"Gladiators", "gladiators", "play/Gladiators"});
            data.add(new Object[]{"FruitSensation", "fruit_sensation_deluxe", "play/FruitSensation"});
            data.add(new Object[]{"DeucesWild", "deuceswild", "play/DeucesWild"});
            data.add(new Object[]{"JacksOrBetterMultiline", "multiline_jacks_or_better", "play/JacksOrBetterMultiline"});
            data.add(new Object[]{"SevensWild", "sevenswild", "play/SevensWild"});
            data.add(new Object[]{"SevensAndJokerWild", "sevens_and_joker", "play/SevensAndJokerWild"});
            data.add(new Object[]{"DoubleJokerPoker", "doublejokerpoker", "play/DoubleJokerPoker"});
            data.add(new Object[]{"FiveJokerPoker", "fivejokerpoker", "play/FiveJokerPoker"});
            data.add(new Object[]{"JacksOrBetter", "jacksorbetter", "play/JacksOrBetter"});
            data.add(new Object[]{"BloodSuckers", "blood_suckers", "play/BloodSuckers"});
            data.add(new Object[]{"CrazyFruit", "crazy_fruit_urartu", "play/CrazyFruit"});
            data.add(new Object[]{"IronMan", "iron_man", "play/IronMan"});
            data.add(new Object[]{"ZolotoPartii", "zoloto_partii", "play/ZolotoPartii"});
            data.add(new Object[]{"OliversBar", "olivers_bar", "play/OliversBar"});
            data.add(new Object[]{"Ramses2", "ramses2", "play/Ramses2"});
            data.add(new Object[]{"SafariHeat", "safari_heat", "play/SafariHeat"});
            data.add(new Object[]{"MermaidsPearl", "mermaids_pearl", "play/MermaidsPearl"});
            data.add(new Object[]{"SecretForest", "secret_forest", "play/SecretForest"});
            data.add(new Object[]{"PharaonsGold3", "pharaons_gold3", "play/PharaonsGold3"});
            data.add(new Object[]{"GryphonsGold", "gryphons_gold", "play/GryphonsGold"});
            data.add(new Object[]{"KingOfCards", "king_of_cards", "play/KingOfCards"});
            data.add(new Object[]{"MagicPrincess", "magic_princess", "play/MagicPrincess"});
            data.add(new Object[]{"AlwaysHot", "always_hot", "play/AlwaysHot"});
            data.add(new Object[]{"RoyalTreasures", "royal_treasures", "play/RoyalTreasures"});
            data.add(new Object[]{"GoldenPlanet", "golden_planet", "play/GoldenPlanet"});
            data.add(new Object[]{"TheMagicFlute", "the_magic_flute", "play/TheMagicFlute"});
//        =175 games=
            return data.iterator();
//

    }
}