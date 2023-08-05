class Solution {
   public int numUniqueEmails(String[] emails) {

        Set<String> validEmails = new TreeSet<>();

        for (int i = 0; i < emails.length; i++) {

            String str[] = emails[i].split("@");

            validEmails.add(str[0].replace(".", "").split("\\+")[0] + "@" + str[1]);

        }

        return validEmails.size();
    }
}