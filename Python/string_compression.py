# hard-level

# String compression with in-place modification typically means 
# compressing a string by replacing consecutive repeated characters 
# with the character followed by the count, 
# all done directly in the original string's space (or an array of characters) without using extra space for another string.

def String_compres(s):
    chars=list(s)
    n=len(chars)
    i=0
    new=0
    
    while i<n:
        j=i
        while j<n and chars[j]==chars[i]:
            j+=1
        chars[new]=chars[i]
        new+=1
        if j-i>1:
            chars[new]=str(j-i)
            new+=1
        i=j
    return "".join(chars[:new])
    
String=input("Enter String for compression: ")
print(String_compres(String))

# try solving it iteratively