import random
import pyperclip

characters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
              't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
              'O', 'P', 'Q', 'R', 'S', 'T',
              'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '`', '~', '!', '@', '#',
              '$', '%', '^', '&', '*', '(', ')', '-', '_', '[', ']', '{', '}', ';',
              ':', '"', '\'', '<', ',', '>', '>', '/', '?', '|', '\\']

length = random.choice(range(13, 20))

password = "".join(random.sample(characters, length))
pyperclip.copy(password)
print("Your password has been copied to your clipboard.")
