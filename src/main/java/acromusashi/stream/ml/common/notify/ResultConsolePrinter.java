/**
* Copyright (c) Acroquest Technology Co, Ltd. All Rights Reserved.
* Please read the associated COPYRIGHTS file for more details.
*
* THE SOFTWARE IS PROVIDED BY Acroquest Technolog Co., Ltd.,
* WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
* BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
* IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDER BE LIABLE FOR ANY
* CLAIM, DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
* OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
*/
package acromusashi.stream.ml.common.notify;

import java.util.Map;

import storm.trident.operation.TridentOperationContext;

/**
 * 結果をログ出力する通知クラス
 * 
 * @author kimura
 *
 * @param <T> 結果出力型
 */
public class ResultConsolePrinter<T> implements ResultNotifier<T>
{
    /** serialVersionUID */
    private static final long serialVersionUID = -2259072781181759415L;

    /** 出力時のヘッダ */
    protected String          header;

    /**
     * ヘッダを指定してインスタンスを生成する。
     * 
     * @param header ログヘッダ
     */
    public ResultConsolePrinter(String header)
    {
        this.header = header;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("rawtypes")
    @Override
    public void initialize(Map conf, TridentOperationContext context)
    {
        // Do nothing.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyResult(T result)
    {
        System.out.println(this.header + result.toString());
    }
}
