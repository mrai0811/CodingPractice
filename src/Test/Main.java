//package Test;
//
//public class Main {
//    public static String sanitizeText(String input) {
//    if (input == null) {
//        return null;
//    }
//
//    // Define allowed tags (Ensuring <br> and <pre> for proper formatting)
//    Safelist whitelist = Safelist.basic()
//            .addTags("h1", "h2", "h3", "h4", "h5", "h6", "br", "p", "pre")
//            .addAttributes("span", "style");
//
//    // Step 1: Convert new lines to <br> before sanitizing (Only if <br> should be used)
//    String modifiedInput = input.replace("\r\n", "\n").replace("\r", "\n").replace("\n", "<br>\n");
//
//    // Step 2: Clean input while preserving safe HTML
//    String cleaned = Jsoup.clean(modifiedInput, whitelist);
//
//    // Step 3: Convert <br> back to \n for correct storage (For database)
//    cleaned = cleaned.replace("<br>", "\n");
//
//    // Step 4: Restore raw characters by unescaping Jsoup's encoding
//    return Parser.unescapeEntities(cleaned, false);
//}
//
//    public static void main(String[] args) {
//        String unsafeInput = "This is a test.\nNew line should be here.\n\nAnother paragraph.";
//        System.out.println(sanitizeText(unsafeInput));
//    }
//}
