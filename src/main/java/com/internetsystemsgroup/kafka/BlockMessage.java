package com.internetsystemsgroup.kafka;

import java.math.BigInteger;

public class BlockMessage {

    private BigInteger blockNumber;
    private String blockHash;
    private String blockParentHash;
    private BigInteger blockNonce;
    private String blockSha3Uncles;
    private String blockLogsBloom;
    private String blockTransactionsRoot;
    private String blockStateRoot;
    private String blockReceiptsRoot;
    private String blockAuthor;
    private String blockMiner;
    private String blockMixHash;
    private BigInteger blockDifficulty;
    private BigInteger blockTotalDifficulty;
    private String blockExtraData;
    private BigInteger blockSize;
    private BigInteger blockGasLimit;
    private BigInteger blockGasUsed;
    private BigInteger blockTimestamp;

    private String hash;
    private String from;
    private String to;
    private BigInteger value;
    private BigInteger gasPrice;
    private BigInteger gas;
    private String input;
    private String creates;
    private String raw;

    public BigInteger getBlockNumber() {
		return this.blockNumber;
	}

	public void setBlockNumber(BigInteger blockNumber) {
		this.blockNumber = blockNumber;
	}

	public String getBlockHash() {
		return this.blockHash;
	}

	public void setBlockHash(String blockHash) {
		this.blockHash = blockHash;
	}

	public String getBlockParentHash() {
		return this.blockParentHash;
	}

	public void setBlockParentHash(String blockParentHash) {
		this.blockParentHash = blockParentHash;
	}

	public BigInteger getBlockNonce() {
		return this.blockNonce;
	}

	public void setBlockNonce(BigInteger blockNonce) {
		this.blockNonce = blockNonce;
	}

	public String getBlockSha3Uncles() {
		return this.blockSha3Uncles;
	}

	public void setBlockSha3Uncles(String blockSha3Uncles) {
		this.blockSha3Uncles = blockSha3Uncles;
	}

	public String getBlockLogsBloom() {
		return this.blockLogsBloom;
	}

	public void setBlockLogsBloom(String blockLogsBloom) {
		this.blockLogsBloom = blockLogsBloom;
	}

	public String getBlockTransactionsRoot() {
		return this.blockTransactionsRoot;
	}

	public void setBlockTransactionsRoot(String blockTransactionsRoot) {
		this.blockTransactionsRoot = blockTransactionsRoot;
	}

	public String getBlockStateRoot() {
		return this.blockStateRoot;
	}

	public void setBlockStateRoot(String blockStateRoot) {
		this.blockStateRoot = blockStateRoot;
	}

	public String getBlockReceiptsRoot() {
		return this.blockReceiptsRoot;
	}

	public void setBlockReceiptsRoot(String blockReceiptsRoot) {
		this.blockReceiptsRoot = blockReceiptsRoot;
	}

	public String getBlockAuthor() {
		return this.blockAuthor;
	}

	public void setBlockAuthor(String blockAuthor) {
		this.blockAuthor = blockAuthor;
	}

	public String getBlockMiner() {
		return this.blockMiner;
	}

	public void setBlockMiner(String blockMiner) {
		this.blockMiner = blockMiner;
	}

	public String getBlockMixHash() {
		return this.blockMixHash;
	}

	public void setBlockMixHash(String blockMixHash) {
		this.blockMixHash = blockMixHash;
	}

	public BigInteger getBlockDifficulty() {
		return this.blockDifficulty;
	}

	public void setBlockDifficulty(BigInteger blockDifficulty) {
		this.blockDifficulty = blockDifficulty;
	}

	public BigInteger getBlockTotalDifficulty() {
		return this.blockTotalDifficulty;
	}

	public void setBlockTotalDifficulty(BigInteger blockTotalDifficulty) {
		this.blockTotalDifficulty = blockTotalDifficulty;
	}

	public String getBlockExtraData() {
		return this.blockExtraData;
	}

	public void setBlockExtraData(String blockExtraData) {
		this.blockExtraData = blockExtraData;
	}

	public BigInteger getBlockSize() {
		return this.blockSize;
	}

	public void setBlockSize(BigInteger blockSize) {
		this.blockSize = blockSize;
	}

	public BigInteger getBlockGasLimit() {
		return this.blockGasLimit;
	}

	public void setBlockGasLimit(BigInteger blockGasLimit) {
		this.blockGasLimit = blockGasLimit;
	}

	public BigInteger getBlockGasUsed() {
		return this.blockGasUsed;
	}

	public void setBlockGasUsed(BigInteger blockGasUsed) {
		this.blockGasUsed = blockGasUsed;
	}

	public BigInteger getBlockTimestamp() {
		return this.blockTimestamp;
	}

	public void setBlockTimestamp(BigInteger blockTimestamp) {
		this.blockTimestamp = blockTimestamp;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigInteger getValue() {
		return this.value;
	}

	public void setValue(BigInteger value) {
		this.value = value;
	}

	public BigInteger getGasPrice() {
		return this.gasPrice;
	}

	public void setGasPrice(BigInteger gasPrice) {
		this.gasPrice = gasPrice;
	}

	public BigInteger getGas() {
		return this.gas;
	}

	public void setGas(BigInteger gas) {
		this.gas = gas;
	}

	public String getInput() {
		return this.input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getCreates() {
		return this.creates;
	}

	public void setCreates(String creates) {
		this.creates = creates;
	}

	public String getRaw() {
		return this.raw;
	}

	public void setRaw(String raw) {
		this.raw = raw;
	}
}