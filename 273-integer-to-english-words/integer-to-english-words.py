class Solution:
    def numberToWords(self, num: int) -> str:
        if num == 0:
            return "Zero"
        ones = ["", "One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"]
        tens = tens = ["", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"]
        def convert(n):
            if n == 0:
                return ""
            if n < 20:
                    return ones[n]
            if n <100:
                    return tens[n//10]+(" "+convert(n%10) if(n%10) else "")
            return ones[n//100]+" Hundred"+(" "+convert(n%100) if(n%100) else "")
        result = []
        units = ["","Thousand", "Million", "Billion"]
        i = 0
        while(num > 0):
            part = num%1000
            if part:
                word = convert(part)
                if units[i]:
                    word+=" "+units[i]
                result.append(word)
            num//=1000
            i+=1
        return " ".join(result[::-1])