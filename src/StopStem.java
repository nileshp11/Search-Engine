import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by SAMARTH on 2/13/2015.
 */
public class StopStem {
    final Set<String> stopWords = new HashSet<String>(Arrays.asList("ca", "ht", "pt", "nl", "vo", "nbsp", "a", "about", "above", "after", "need", "thats", "using", "he'd", "said", "noted", "particular", "until", "becoming", "thanks", "over", "ff", "thereby", "she", "something", "right", "these", "else", "once", "possibly", "shown", "respectively", "he", "theirs", "apart", "shows", "few", "further", "he's", "somebody", "downwards", "herself", "each", "wherever", "go", "t's", "she's", "before", "accordingly", "made", "indicate", "namely", "six", "ed", "hereafter", "she'd", "sufficiently", "slightly", "could", "consider", "eighty", "usually", "ninety", "tell", "do", "affecting", "whither", "thorough", "f", "look", "g", "ex", "d", "may", "e", "b", "noone", "c", "needs", "a", "n", "o", "l", "m", "won't", "j", "ones", "k", "h", "i", "w", "yes", "v", "somethan", "ref", "eg", "u", "new", "t", "s", "what", "r", "q", "p", "nothing", "having", "et", "z", "y", "strongly", "x", "here's", "yet", "shes", "ca", "thru", "anywhere", "least", "you'd", "took", "by", "same", "enough", "has", "who", "couldn't", "would", "approximately", "any", "everybody", "overall", "had", "primarily", "be", "biol", "think", "get", "seeing", "begins", "likely", "far", "a's", "much", "and", "co", "particularly", "gotten", "near", "i'd", "better", "often", "against", "doing", "containing", "seeming", "example", "i'm", "make", "does", "invention", "shan't", "ignored", "saying", "obtained", "aren", "tried", "former", "through", "possible", "following", "especially", "name", "tries", "edu", "all", "keeps", "five", "obviously", "makes", "she'll", "at", "as", "still", "hello", "therefore", "neither", "shed", "never", "which", "see", "ran", "take", "sec", "anyone", "am", "i'll", "there", "an", "off", "thoroughly", "ah", "nay", "why", "they", "nobody", "somehow", "you've", "no", "nine", "otherwise", "anyways", "hed", "of", "help", "given", "among", "recently", "says", "anybody", "hes", "on", "only", "her", "ok", "everyone", "that's", "itself", "oh", "maybe", "or", "done", "regarding", "third", "sensible", "them", "then", "will", "ought", "furthermore", "novel", "auth", "upon", "different", "indeed", "getting", "home", "announce", "most", "thanx", "followed", "across", "aside", "looking", "thank", "normally", "unless", "where's", "mg", "rather", "me", "ml", "aren't", "similar", "kept", "mr", "pages", "don't", "it's", "et-al", "my", "whereupon", "na", "okay", "it'd", "specified", "per", "how's", "nd", "sometime", "within", "thereupon", "described", "truly", "follows", "you're", "cause", "second", "tends", "hid", "last", "sometimes", "being", "contains", "since", "actually", "him", "where", "every", "eight", "related", "potentially", "almost", "unto", "looks", "kg", "more", "results", "his", "inc", "we'd", "when", "someone", "wonder", "value", "useful", "none", "certainly", "seriously", "everywhere", "asking", "onto", "appropriate", "isn't", "c's", "such", "hers", "liked", "means", "whereafter", "here", "anymore", "heres", "predominantly", "km", "whole", "this", "causes", "appreciate", "becomes", "way", "adj", "from", "hi", "believe", "while", "was", "id", "allows", "ain't", "able", "if", "corresponding", "seemed", "ie", "below", "various", "wherein", "lest", "between", "less", "those", "is", "it", "added", "besides", "ourselves", "gives", "similarly", "important", "your", "gets", "into", "howbeit", "im", "past", "in", "know", "section", "two", "away", "necessary", "proud", "themselves", "act", "also", "lets", "changes", "found", "couldnt", "appear", "etc", "they'll", "arent", "hopefully", "ours", "its", "omitted", "yourselves", "showed", "exactly", "c'mon", "although", "formerly", "greetings", "it'll", "entirely", "along", "secondly", "serious", "alone", "awfully", "going", "nowhere", "relatively", "how", "under", "suggest", "available", "became", "indicated", "always", "theres", "inward", "refs", "itd", "own", "indicates", "specify", "try", "we", "reasonably", "specifying", "give", "i've", "accordance", "next", "use", "hardly", "vs", "consequently", "run", "date", "mrs", "resulting", "when's", "significant", "substantially", "best", "whenever", "mostly", "definitely", "unfortunately", "whatever", "we'll", "later", "come", "back", "us", "seen", "un", "seem", "cannot", "up", "gave", "either", "insofar", "sorry", "doesn't", "they'd", "down", "part", "quickly", "happens", "keep", "to", "arise", "affects", "com", "both", "inner", "uucp", "become", "you'll", "somewhere", "poorly", "meantime", "must", "th", "didn't", "affected", "after", "mug", "necessarily", "nevertheless", "who's", "whereby", "considering", "taken", "welcome", "what's", "index", "however", "whose", "so", "behind", "gone", "willing", "whereas", "that", "associated", "than", "whom", "unlikely", "thence", "several", "previously", "due", "got", "ltd", "immediately", "hereby", "sub", "can", "www", "about", "well", "sup", "re", "rd", "above", "que", "qv", "four", "placed", "too", "yours", "thus", "resulted", "moreover", "provides", "you", "soon", "owing", "immediate", "seven", "anything", "effect", "whoever", "abst", "certain", "somewhat", "pp", "our", "brief", "very", "specifically", "out", "forth", "via", "for", "hereupon", "everything", "hundred", "towards", "zero", "whether", "went", "elsewhere", "beyond", "course", "whence", "are", "shouldn't", "can't", "page", "briefly", "yourself", "therein", "thereafter", "plus", "information", "million", "others", "we're", "mainly", "viz", "did", "again", "wasn't", "like", "without", "shall", "'ll", "non", "many", "not", "present", "nos", "he'll", "nor", "obtain", "haven't", "anyhow", "cant", "now", "promptly", "say", "myself", "saw", "ask", "some", "why's", "outside", "might", "put", "line", "ord", "self", "trying", "they've", "according", "seems", "twice", "latter", "presumably", "inasmuch", "probably", "giving", "want", "end", "regardless", "hence", "just", "readily", "fifth", "let", "already", "should", "research", "wouldn't", "really", "successfully", "beforehand", "mustn't", "clearly", "despite", "hither", "but", "old", "afterwards", "meanwhile", "wish", "herein", "hadn't", "amongst", "little", "show", "used", "together", "though", "been", "hasn't", "anyway", "were", "sent", "please", "toward", "there's", "three", "concerning", "sure", "throughout", "goes", "except", "regards", "we've", "comes", "wants", "himself", "knows", "importance", "contain", "even", "latterly", "known", "perhaps", "ever", "stop", "other", "allow", "have", "one", "selves", "currently", "recent", "merely", "let's", "showns", "because", "another", "fix", "during", "lately", "mean", "they're", "apparently", "beginnings", "weren't", "with", "beginning", "nearly", "the", "came", "ending", "around", "begin", "beside", "nonetheless", "quite", "largely", "instead", "uses", "significantly", "their", "first", "miss"));

    public String stemming(String str) {
        Stemmer s = new Stemmer();
        for (int c = 0; c < str.length(); c++) s.add(str.charAt(c));
        s.stem();
        return s.toString();
    }
}