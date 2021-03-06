/**
 * 这个api包是公共接口包，用于抽离调用者和提供者的公共接口，以便统一维护。
 * 一般来说，会将公共接口组合成一个Dubbo的子项目，但是这里为了方便，只
 * 是单纯地放在同一个包下。
 *
 * 提供者需要实现这个包下定义的接口，如果有需要可以作为接口开放出去。
 *
 * 对于RPC风格的调用来说，调用者和提供者应该使用同一类型的接口定义；对于REST风
 * 格，接口是否需要抽离出来没有什么影响。
 */

package org.xujiale.dubbodemo.api;