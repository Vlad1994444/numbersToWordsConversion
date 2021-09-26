import com.vladislav.conversion.mainLogic.Convert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(Parameterized.class)
public class Testing {

    private final String name;
    private final int number;

    @Parameterized.Parameters
    public static Collection<Object[]> combos() {

        List<Object[]> args = new ArrayList<>();

        String line;

        Pattern numberPattern = Pattern.compile("\\d+");

        List<Integer> numbers = new ArrayList<>();
        List<String> names = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\test\\java\\input.txt"))) {
            while ((line = bufferedReader.readLine()) != null) {
                Matcher matcher = numberPattern.matcher(line);
                if (matcher.find()) {
                    numbers.add(Integer.parseInt(line));
                } else {
                    names.add(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < numbers.size(); i++) {
            args.add(new Object[]{names.get(i), numbers.get(i)});
        }
        return args;
    }

    public Testing(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Test
    public void testOne() {
        Convert convert = new Convert();
        String str = name;
        int numb = number;
        Assert.assertEquals(str, convert.convert(numb));
    }
}
