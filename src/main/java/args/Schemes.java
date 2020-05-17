package args;

import args.exception.ParseSchemeException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/5/17 9:01 AM
 */
public class Schemes {

    private final List<SchemeFlag> schemeList;

    public Schemes(String schemeText) {
        try {
            schemeList = stream(schemeText.split(","))
                    .map(s -> new SchemeFlag(s.split(":")[0], s.split(":")[1])).collect(Collectors.toList());
        } catch (ParseSchemeException pse) {
            throw new ParseSchemeException("解析参数结构异常： 参数格式输入有误,请检查输入格式: flag:type,flag1:type1");
        }
    }

    public Object getType(String flag) {
        Optional<SchemeFlag> flagOptional = schemeList.stream().filter(sl -> sl.getFlag().equals(flag)).findFirst();
        return flagOptional.<Object>map(SchemeFlag::getType).orElse(null);
    }

    public int size() {
        return schemeList.size();
    }

    public Object parseOf(String flag, String value) {
        Optional<SchemeFlag> flagOptional = schemeList.stream().filter(sl -> sl.getFlag().equals(flag)).findFirst();
        return flagOptional.map(schemeFlag -> schemeFlag.parseOf(value)).orElse(null);
    }
}
