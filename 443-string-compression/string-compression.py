from typing import List

class Solution:
    def compress(self, chars: List[str]) -> int:
        if not chars:
            return 0

        # Initialize pointers and the result list
        result = []
        count = 1

        # Iterate through the list of characters
        for i in range(1, len(chars) + 1):
            if i < len(chars) and chars[i] == chars[i - 1]:
                count += 1
            else:
                result.append(chars[i - 1])
                if count > 1:
                    result.extend(list(str(count)))
                count = 1

        # Update the original list with the compressed result
        chars[:] = result

        # Return the length of the compressed list
        return len(chars)

