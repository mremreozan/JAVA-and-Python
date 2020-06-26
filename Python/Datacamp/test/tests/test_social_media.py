# -*- coding: utf-8 -*-
"""
Created on Sun May 31 16:39:40 2020

@author: Utilisateur
"""

import pytest
from collections import Counter
import sys
sys.path.append("../..")
from oop_package import SocialMedia

# Create an instance of SocialMedia for testing
test_post = 'learning #python & #rstats is awesome! thanks @datacamp!'
sm_post = SocialMedia(test_post)

# Test hashtag counts are created properly
def test_social_media_hashtags():
    expected_hashtag_counts = Counter({'#python': 1, '#rstats': 1})
    assert sm_post.hashtag_counts == expected_hashtag_counts
    
# This test file is tested by unit_test_and_pytest.ipynb