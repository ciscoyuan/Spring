/**
 * 
 */
package com.finals.generator.util;

/**
 * 
 * @author zhangqp
 * @version 1.0, 2017年4月10日
 */
public class SimpleExprMatcher {
	private int start  = -1;
	private int end    = -1;
	private int index  = -1;
	private int lastAppendIndex = 0;
	
	private char[] inputChars;
	private char[] startWith;  //${
	private char[] endWith;    //}
	
	public SimpleExprMatcher reset() {
		start = -1;
		end = -1;
		index = -1;
		return this;
	}
	
	public int start() {
		return start;
	}
	public int end() {
		return end;
	}
	
	/**
	 * 默认使用${}表达式
	 * @param input
	 */
	public SimpleExprMatcher(String input) {
        this(input, "${","}");
	}
	
	public SimpleExprMatcher(String input, String exprStart, String exprEnd) {
        this.inputChars = input.toCharArray();
        this.startWith = exprStart.toCharArray();
        this.endWith = exprEnd.toCharArray();
    }
	
	/**
	 * 查找
	 * @return
	 */
	public boolean find() {
	    int tmpStart = -1;
		for (int i = index+1; i < inputChars.length; i++) {
			if (start(i)) {
			    tmpStart = i;
				i = i + startWith.length - 1;
				continue;
			}
			if (end(i)) {
				if (tmpStart == -1) continue;
				start = tmpStart;
				end = i + endWith.length;
				index = end; //记录当前解析到的位置
				return true;
			}
		}
		return false;
	}

    private boolean end(int index) {
        for (int i = 0, len=endWith.length; i<len; i++) {
            if (endWith[i] != inputChars[index + i]) {
                return false;
            }
        }
        return true;
    }

    private boolean start(int index) {
        for (int i = 0, len=startWith.length; i<len; i++) {
            if (startWith[i] != inputChars[index + i]) {
                return false;
            }
        }
        return true;
    }
	
	/**
	 * 获取匹配的结果 ${field}
	 * @return
	 */
	public String getMatched() {
		return new String(this.inputChars, start, end - start);
	}
	
	/**
	 * 获取匹配的结果 ${field}的field值
	 * @return
	 */
	public String getMatchedField() {
        return new String(this.inputChars, (start + startWith.length), (end - start - startWith.length - endWith.length));
    }
	
    /**
     * 替换当前查找到的内容
     * @param sb
     * @param replacement
     */
    public void appendReplacement(StringBuffer sb, String replacement) {
        if (start < 0) {
            throw new IllegalStateException("No match available");
        }
        sb.append(inputChars, lastAppendIndex, start - lastAppendIndex);
        sb.append(replacement);
        lastAppendIndex = end;
    }

    /**
     * 追加剩余内容
     * @param sb
     */
    public void appendTail(StringBuffer sb) {
        sb.append(inputChars, lastAppendIndex, inputChars.length - lastAppendIndex);
    }
}
