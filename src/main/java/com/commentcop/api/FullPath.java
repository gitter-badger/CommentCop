/**
 * Copyright (c) 2017 Filipe Freire
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.commentcop.api;

import java.util.List;
import org.cactoos.Text;
import org.cactoos.list.ListOf;
import org.cactoos.text.JoinedText;

/**
 * Simple FullPath representation.
 *
 * @author Filipe Freire (livrofubia@gmail.com)
 * @version $Id: ??? $
 * @since 1.0
 */
public class FullPath {

    /**
     * Url parts.
     */
    private final List<String> parts;

    /**
     * Ctor.
     *
     * @param texts Text parts of FullPath
     */
    public FullPath(final String... texts) {
        this.parts = new ListOf<>(texts);
    }

    /**
     * FullPath full path.
     *
     * @return Text
     */
    public final Text path() {
        return new JoinedText(
            "/",
            this.parts
        );
    }
}
