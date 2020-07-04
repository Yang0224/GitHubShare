package com.strman.strman_demo;

import java.util.Map;
import java.util.Optional;

import strman.Strman;

public class StrmanDemo {
	public static void main(String[] args) {
		
		/**
		 * 多个字符串拼接
		 */
		System.out.println("append ==>> " + Strman.append("yang", "shao", "ping"));
		
		/**
		 * 字符串拼接字符串数组
		 */
		System.out.println("appendArray ==>> " + Strman.appendArray("yang", new String[]{"shao", "ping"}));
		
		/**
		 * 获取字符串中某下表的字符
		 */
		Optional<String> optional = Strman.at("yang", 0);
		System.out.println("at ==>> " + optional.get());
		
		/**
		 * 返回一个包含start和end之间的字符串的数组
		 */
		String[] str = Strman.between("yangshaoping", "yang", "ping");
		for (String s : str) {
			System.out.println(s);
		}
		
		/**
		 * 返回字符串中所有单字符
		 */
		String[] chars = Strman.chars("yang");
		for (String c : chars) {
			System.out.println(c);
		}
		
		/**
		 * 用一个空格替换连续的空格字符。
		 */
		System.out.println("collapseWhitespace ==>> " + Strman.collapseWhitespace("yang     shao    ping"));
		
		/**
		 * 判断字符串是否存在
		 * 不区分大小写
		 */
		System.out.println("contains ==>> " + Strman.contains("YangShaoPing", "yang"));
		
		/**
		 * 判断字符串是否存在
		 * 第三个参数 true:区分大小写	false:不区分大小写
		 */
		System.out.println("contains ==>> " + Strman.contains("YangShaoPing", "yang", true));
		
		/**
		 * 判断字符串数组中所有字符串是否存在
		 * 如果某一个不存在 则返回false，即使其他的都存在
		 * 不区分大小写
		 */
		System.out.println("containsAll ==>> " + Strman.containsAll("YangShaoPing", new String[]{"yang", "shao"}));
		
		/**
		 * 判断字符串数组中所有字符串是否存在
		 * 如果某一个不存在 则返回false，即使其他的都存在
		 * 第三个参数 true:区分大小写	false:不区分大小写
		 */
		System.out.println("containsAll ==>> " + Strman.containsAll("YangShaoPing", new String[]{"yang", "shao"}, true));
		
		/**
		 * 判断字符串数组中所有字符串是否存在
		 * 如果某一个存在 则返回true，即使其他的都不存在
		 * 不区分大小写
		 */
		System.out.println("containsAny ==>> " + Strman.containsAny("YangShaoPing", new String[]{"yang", "shaoa"}));
		
		/**
		 * 判断字符串数组中所有字符串是否存在
		 * 如果某一个存在 则返回true，即使其他的都不存在
		 * 第三个参数	 true:区分大小写	false:不区分大小写
		 */
		System.out.println("containsAny ==>> " + Strman.containsAny("YangShaoPing", new String[]{"yang", "shaoa"}, true));
		
		/**
		 * 计算字符串出现的次数
		 * 区分大小写
		 */
		System.out.println("countSubstr ==>> " + Strman.countSubstr("YangShaoPingYang", "Yang"));
		
		/**
		 * 计算字符串出现的次数
		 * 第三个参数	 true:区分大小写	false:不区分大小写
		 * 第四个参数	 没搞懂
		 */
		System.out.println("countSubstr ==>> " + Strman.countSubstr("YangShaoPingYangYang", "Y", true, false));
		
		/**
		 * 是否以某字符串结尾
		 * 区分大小写
		 */
		System.out.println("endsWith ==>> " + Strman.endsWith("YangShaoPing", "Ping"));
		
		/**
		 * 是否以某字符串结尾
		 * 第三个参数	 true:区分大小写	false:不区分大小写
		 */
		System.out.println("endsWith ==>> " + Strman.endsWith("YangShaoPing", "ping", true));
		
		/**
		 * 是否以某字符串结尾
		 * 第三个参数  定位到你想要搜索的位置。 没搞懂，不管
		 * 第四个参数	 true:区分大小写	false:不区分大小写
		 */
		System.out.println("endsWith ==>> " + Strman.endsWith("YangShaoPing", "yang", 4, false));
		
		/**
		 * 是否以某字符串开始 
		 * 如果为false 则将此字符串添加至开始  如果true则返回原字符串
		 * 区分大小写
		 */
		System.out.println("ensureLeft ==>> " + Strman.ensureLeft("YangShaoPing", "Yang"));
		
		/**
		 * 是否以某字符串开始
		 * 如果为false 则将此字符串添加至开始  如果true则返回原字符串
		 * 第三个参数	 true:区分大小写	false:不区分大小写
		 */
		System.out.println("ensureLeft ==>> " + Strman.ensureLeft("YangShaoPing", "yang", false));
		
		/**
		 * base64加密
		 */
		String base64 = Strman.base64Encode("YangShaoPing");
		System.out.println("base64Encode ==>> " + base64);
		
		/**
		 * base64解密
		 */
		System.out.println("base64Decode ==>> " + Strman.base64Decode(base64));
		
		/**
		 * 将字符串转换为二进制unicode(16位)
		 */
		String bin = Strman.binEncode("YangShaoPing");
		System.out.println("binEncode ==>> " + bin);
		
		/**
		 * 将二进制unicode(16位)转换为字符串
		 */
		System.out.println("binDecode ==>> " + Strman.binDecode(bin));
		
		/**
		 * 将字符串字符转换为十进制unicode(5位)
		 */
		String dec = Strman.decEncode("YangShaoPing");
		System.out.println("decEncode ==>> " + dec);
		
		/**
		 * 将十进制unicode(5位)转换为字符串
		 */
		System.out.println("decDecode ==>> " + Strman.decDecode(dec));
		
		/**
		 * 将字符串字符转换为十六进制unicode(4位)
		 */
		String hex = Strman.hexEncode("YangShaoPing");
		System.out.println("hexEncode ==>> " + hex);
		
		/**
		 * 将十六进制unicode(4位)转换为字符串
		 */
		System.out.println("hexDecode ==>> " + Strman.hexDecode(hex));
		
		/**
		 * 是否以某字符串结尾
		 * 如果为false 则将此字符串添加至开始  如果true则返回原字符串
		 * 区分大小写
		 */
		System.out.println("ensureRight ==>> " + Strman.ensureRight("YangShaoPing", "ping"));
		
		/**
		 * 将所有可应用的字符转换为HTML实体。
		 */
		String html = Strman.htmlEncode("<span>YangShaoPing</span>");
		System.out.println("htmlEncode ==>> " + html);
		
		/**
		 * 将所有的HTML实体转换为适用的字符。
		 */
		System.out.println("htmlDecode ==>> " + Strman.htmlDecode(html));
		
		/**
		 * 是否以某字符串结尾
		 * 如果为false 则将此字符串添加至开始  如果true则返回原字符串
		 * 第三个参数	 true:区分大小写	false:不区分大小写
		 */
		System.out.println("ensureRight ==>> " + Strman.ensureRight("YangShaoPing", "ping", true));
		
		/**
		 * 返回从头开始的n位字符串
		 */
		Optional<String> first = Strman.first("YangShaoPing", 3);
		System.out.println("first ==>> " + first.get());
		
		/**
		 * 返回从尾开始的n位字符串
		 */
		System.out.println("last ==>> " + Strman.last("YangShaoPing", 3));
		
		/**
		 * 返回第一个字符
		 */
		Optional<String> head = Strman.head("YangShaoPing");
		System.out.println("head ==>> " + head.get());
		
		/**
		 * 格式化字符串   不晓得什么卵用
		 */
		System.out.println("format ==>> " + Strman.format("YangShaoPing", "ao"));
		
		/**
		 * indexOf()方法在指定值的第一次出现的调用字符串中返回索引，从fromIndex开始搜索。如果没有找到值，则返回-1。
		 * offset - 开始搜索的偏移量。
		 * caseSensitive - 是否区分大小写  true:区分大小写	false:不区分大小写
		 */
		System.out.println("indexOf ==>> " + Strman.indexOf("YangShaoPing", "shao", 3, false));
		
		/**
		 * 判断两个字符串是否是不相等的
		 * 不相等返回true 
		 */
		System.out.println("unequal ==>> " + Strman.unequal("YangShaoPing", "YangShaoPinga"));
		
		/**
		 * 往value中索引的位置插入substr 
		 */
		System.out.println("insert ==>> " + Strman.insert("YangShaoPing", "YYY", 0));
		
		/**
		 * 验证字符串是否为大写  
		 */
		System.out.println("isUpperCase ==>> " + Strman.isUpperCase("YSP"));
		
		/**
		 * 验证字符串是否为小写  
		 */
		System.out.println("isLowerCase ==>> " + Strman.isLowerCase("YSP"));
		
		/**
		 * 返回一个给定长度的新字符串，这样字符串的开头就会被填充。
		 * length - value长度 的差  由pad填充
		 */
		System.out.println("leftPad ==>> " + Strman.leftPad("YangShaoPing", "Ya", 15));
		
		/**
		 * 返回一个给定长度的新字符串，这样字符串的结尾就会被填充。
		 * length - value长度 的差  由pad填充
		 */
		System.out.println("rightPad ==>> " + Strman.rightPad("YangShaoPing", "Ya", 15));
		
		/**
		 * 是否是字符串
		 */
		System.out.println("isString ==>> " + Strman.isString(12345));
		
		/**
		 * 该方法返回指定值的最后一次出现的调用字符串对象中的索引，如果没有找到值，则返回-1。
		 * 区分大小写
		 */
		System.out.println("lastIndexOf ==>> " + Strman.lastIndexOf("YangShaoPingShao", "Shao"));
		
		/**
		 * 该方法返回指定值的最后一次出现的调用字符串对象中的索引，如果没有找到值，则返回-1。
		 * caseSensitive - 是否区分大小写  true:区分大小写	false:不区分大小写
		 */
		System.out.println("lastIndexOf ==>> " + Strman.lastIndexOf("YangShaoPingShao", "shao", true));
		
		/**
		 * 该方法返回指定值的最后一次出现的调用字符串对象中的索引，如果没有找到值，则返回-1。
		 * offset - 开始搜索的索引
		 * caseSensitive - 是否区分大小写  true:区分大小写	false:不区分大小写
		 */
		System.out.println("lastIndexOf ==>> " + Strman.lastIndexOf("YangShaoPingShao", "Shao", 11, false));
		
		/**
		 * 删除左边的所有空格
		 */
		System.out.println("leftTrim ==>> " + Strman.leftTrim("   Yang  Shao  Ping  Shao"));
		
		/**
		 * 删除左边的所有空格
		 */
		System.out.println("leftTrim ==>> " + Strman.leftTrim("   Yang  Shao  Ping  Shao"));
		
		/**
		 * 删除右边的所有空格
		 */
		System.out.println("rightTrim ==>> " + Strman.rightTrim("   Yang  Shao  Ping  Shao   "));
		
		/**
		 * 返回字符串长度 和.length一样
		 */
		System.out.println("length ==>> " + Strman.length("Yang ShaoPingShao"));
		
		/**
		 * 往头部填充字符串
		 */
		System.out.println("prepend ==>> " + Strman.prepend("YangShaoPing", "Shao", "Ping"));
		
		/**
		 * 往头部填充字符串
		 */
		System.out.println("prependArray ==>> " + Strman.prependArray("YangShaoPingShao", new String[]{"Shao", "Ping"}));
		
		/**
		 * 从字符串数组中删除空字符串
		 */
		String [] removeEmptyStrings = Strman.removeEmptyStrings(new String[]{"yang","","shao","ping"});
		for (String string : removeEmptyStrings) {
			System.out.println(string);
		}
		
		/**
		 * 如果prefix在value头部，则返回删除prefix后的新字符串
		 */
		System.out.println("removeLeft ==>> " + Strman.removeLeft("YangShaoPing", "Shao"));
		
		/**
		 * 如果prefix在value头部，则返回删除prefix后的新字符串
		 * caseSensitive - 是否区分大小写  true:区分大小写	false:不区分大小写
		 */
		System.out.println("removeLeft ==>> " + Strman.removeLeft("YangShaoPing", "yang", false));
		
		/**
		 * 如果prefix在value尾部，则返回删除prefix后的新字符串
		 */
		System.out.println("removeRight ==>> " + Strman.removeRight("YangShaoPing", "ping"));
		
		/**
		 * 如果prefix在value尾部，则返回删除prefix后的新字符串
		 * caseSensitive - 是否区分大小写  true:区分大小写	false:不区分大小写
		 */
		System.out.println("removeRight ==>> " + Strman.removeRight("YangShaoPing", "ping", false));
		
		/**
		 * 删除所有非文字字符。
		 * 除了英文字母和数字，其他全删
		 */
		System.out.println("removeNonWords ==>> " + Strman.removeNonWords("啊YangShaoPing123!@#@!#"));
		
		/**
		 * 移除所有空格
		 */
		System.out.println("removeSpaces ==>> " + Strman.removeSpaces("Y a n g ShaoPing"));
		
		/**
		 * 返回一个重复的字符串，给定一个乘数。
		 * 卵用   直接遗弃  mmp 耽搁时间
		 */
		System.out.println("repeat ==>> " + Strman.repeat("YangShaoPing", 2));
		
		/**
		 * 反向输出字符串
		 */
		System.out.println("reverse ==>> " + Strman.reverse("YangShaoPing"));
		
		/**
		 * 将字符串安全地截断，而不是将字切成两半。它总是返回最后一个完整的单词。
		 *  length - 截短字符串的最大尺寸
		 *  filler - 字符串将被添加到返回字符串的末尾。例如:“……”
		 *  我日你妈卖批  什么鬼玩意儿  屁用  fuck
		 */
		System.out.println("safeTruncate ==>> " + Strman.safeTruncate("YangShaoPing", 3, "Yang"));
		
		/**
		 * 截取字符串  不包含截取的那个字符串
		 */
		String[] split = Strman.split("YangShaoPingShao", "Shao");
		for (String s : split) {
			System.out.println(s);
		}
		
		/**
		 * 同上差球不多
		 */
		String[] words = Strman.words("YangShaoPingShao", "Shao");
		for (String s : words) {
			System.out.println(s);
		}
		
		/**
		 * 它以随机的顺序返回一个字符串。
		 */
		System.out.println("shuffle ==>> " + Strman.shuffle("YangShaoPing"));
		
		/**
		 * 相当于以某下标往右截取多少位
		 */
		System.out.println("slice ==>> " + Strman.slice("YangShaoPing", 1, 8));
		
		/**
		 * 和转成小写没区别
		 */
		System.out.println("slugify ==>> " + Strman.slugify("YangShaoPing"));
		
		/**
		 * 将无效字符转成能识别的编码
		 */
		System.out.println("transliterate ==>> " + Strman.transliterate("搜索YangShaoPing!@#!@##!@<>"));
		
		/**
		 * 给字符串加上前缀和后缀
		 */
		System.out.println("surround ==>> " + Strman.surround("YangShaoPing", "Yang", "Ping"));
		
		/**
		 * 变成驼峰
		 */
		System.out.println("toCamelCase ==>> " + Strman.toCamelCase("YangShaoPing"));
		
		/**
		 * 变成柱形
		 */
		System.out.println("toStudlyCase ==>> " + Strman.toStudlyCase("YangShaoPing"));
		
		/**
		 * 去除第一个字符
		 */
		Optional<String> tail = Strman.tail("啊aYangShaoPing");
		System.out.println("tail ==>> " + tail.get());
		
		/**
		 * 单词之间加-
		 */
		System.out.println("toKebabCase ==>> " + Strman.toKebabCase("YangShaoPing"));
		
		/**
		 * 单词之间加下划线
		 */
		System.out.println("toSnakeCase ==>> " + Strman.toSnakeCase("YangShaoPing"));
		
		/**
		 * 拼接数组  之间加上separator
		 */
		System.out.println("join ==>> " + Strman.join(new String[]{"yang", "shao", "ping"}, ","));
		
		/**
		 * 将字符串的第一个字符转换为大写字母，然后将字符串转换为小写字母。
		 */
		System.out.println("capitalize ==>> " + Strman.capitalize("yangShaoPing"));

		/**
		 * 将字符串的第一个字符转换为小写字符。
		 */
		System.out.println("lowerFirst ==>> " + Strman.lowerFirst("YangShaoPing"));

		/**
		 * 将字符串的第一个字符转换为大写。
		 */
		System.out.println("upperFirst ==>> " + Strman.upperFirst("yangShaoPing"));

		/**
		 * 删除开头空白
		 */
		Optional<String> trimStart = Strman.trimStart("  YangShaoPing  ");
		System.out.println("trimStart ==>> " + trimStart.get());
		
		/**
		 * 删除尾巴上的空白
		 */
		Optional<String> trimEnd = Strman.trimEnd("  YangShaoPing  ");
		System.out.println("trimEnd ==>> " + trimEnd.get());
		
		/**
		 * 计算字符串中每个字符出现的次数
		 */
		Map<Character, Long> charsCount = Strman.charsCount("a2131da54qw5eqw65e1q32qwe123qw1e32qw");
		System.out.println("charsCount ==>> " + charsCount.toString());
		
	}
}
