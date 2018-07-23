

add_library( # Sets the name of the library.
             xhooktest

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             xhooktest.c )

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
                       xhooktest

                       # Links the target library to the log library
                       # included in the NDK.
                       log )